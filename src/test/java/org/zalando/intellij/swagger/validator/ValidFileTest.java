package org.zalando.intellij.swagger.validator;

import org.zalando.intellij.swagger.SwaggerLightCodeInsightFixtureTestCase;

public class ValidFileTest extends SwaggerLightCodeInsightFixtureTestCase {

    private void doTest(final String fileName) {
        myFixture.testHighlighting(true, false, false, "validator/" + fileName);
    }

    public void thatFileHasNoErrors() {
        doTest("no_errors.json");
        doTest("no_errors.yaml");
    }

}
