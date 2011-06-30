package org.motechproject.ws;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

public class RequestParameterBuilderTest {

    @Test
    public void shouldBuildRequestParameters() throws UnsupportedEncodingException {
        RequestParameterBuilder builder = new RequestParameterBuilder("?", "UTF-8");
        builder.append("text", "Hello hi");
        builder.append("time", "2011-10-10 10:10:10");
        builder.append("number", "+233123456");
        builder.append("code", "1982");
        builder.append("code2", "");
        builder.append(null, "");
        builder.append("A", " ");

        String expected = "?text=Hello+hi&time=2011-10-10+10%3A10%3A10&number=%2B233123456&code=1982";
        assertEquals(expected, builder.toString());
    }
}
