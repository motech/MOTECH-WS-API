package org.motechproject.ws;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class RequestParameterBuilder {

    private StringBuilder builder;
    private String encoding;
    private static final String EMPTY = "";
    private static final String UTF_8 = "UTF-8";
    private static final String AMP = "&";

    public RequestParameterBuilder(String encoding) {
        this(EMPTY, UTF_8);
    }

    public RequestParameterBuilder(String value, String encoding) {
        builder = new StringBuilder(value);
        this.encoding = encoding != null ? encoding : UTF_8;
    }

    public RequestParameterBuilder append(String key, String value) throws UnsupportedEncodingException {
        builder.append(key).append("=").append(encode(value)).append(AMP);
        return this;
    }

    private String encode(String value) throws UnsupportedEncodingException {
        return URLEncoder.encode(value, encoding);
    }

    @Override
    public String toString() {
        String parameters = builder.toString();
        if (parameters.endsWith(AMP)) {
            return parameters.substring(0, parameters.length() - 1);
        }
        return parameters;
    }
}
