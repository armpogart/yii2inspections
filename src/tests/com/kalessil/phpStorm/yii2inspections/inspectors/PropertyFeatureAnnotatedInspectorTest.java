package com.kalessil.phpStorm.yii2inspections.inspectors;

import com.intellij.testFramework.fixtures.CodeInsightFixtureTestCase;

final public class PropertyFeatureAnnotatedInspectorTest extends CodeInsightFixtureTestCase {
    public void testIfFindsAllPatterns() {
        myFixture.configureByFile("fixtures/property-tags.php");
        myFixture.enableInspections(PropertyFeatureAnnotatedInspector.class);
        myFixture.testHighlighting(true, false, true);
    }
}