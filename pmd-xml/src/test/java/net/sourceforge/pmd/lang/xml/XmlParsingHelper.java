/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.xml;

import org.jetbrains.annotations.NotNull;

import net.sourceforge.pmd.lang.ast.test.BaseParsingHelper;
import net.sourceforge.pmd.lang.pom.PomLanguageModule;
import net.sourceforge.pmd.lang.wsdl.WsdlLanguageModule;
import net.sourceforge.pmd.lang.xml.ast.XmlParser.RootXmlNode;

/**
 * @author Clément Fournier
 */
public final class XmlParsingHelper extends BaseParsingHelper<XmlParsingHelper, RootXmlNode> {

    public static final XmlParsingHelper XML = new XmlParsingHelper(XmlLanguageModule.NAME, Params.getDefaultProcess());
    public static final XmlParsingHelper WSDL = new XmlParsingHelper(WsdlLanguageModule.NAME, Params.getDefaultProcess());
    public static final XmlParsingHelper POM = new XmlParsingHelper(PomLanguageModule.NAME, Params.getDefaultProcess());


    private XmlParsingHelper(@NotNull String langName, @NotNull Params params) {
        super(langName, RootXmlNode.class, params);
    }

    @NotNull
    @Override
    protected XmlParsingHelper clone(@NotNull Params params) {
        return new XmlParsingHelper(this.getLangName(), params);
    }
}
