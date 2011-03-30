package org.motechproject.ws;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.motechproject.ws.rct.ControlGroup.*;

public class ControlGroupTest {

    @Test
    public void shouldTestControlGroupCategory() {
        assertTrue(T.isTreatment());
        assertTrue(T.isAssignable());

        assertFalse(C.isTreatment());
        assertTrue(C.isAssignable());

        assertFalse(NONE.isAssignable());
    }
}
