import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by ruzanna.hovsepyan on 9/10/2018.
 */
public class XmLReader {
    String filePath;

    public XmLReader(String filePath) {
        this.filePath = filePath;
    }

    void read(){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(file);
        factory.setValidating(true);
        Element root = doc.getDocumentElement();
        System.out.println("Root element:" + doc.getDocumentElement().getTagName());
        parse(root.getChildNodes());
       // download();
    }

    private static void parse(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node childNode = nodeList.item(i);
            if (childNode instanceof Element) {
                System.out.print(childNode.getNodeName() + " ");
                if (childNode.hasAttributes()) {
                    NamedNodeMap attributes = childNode.getAttributes();
                    for (int j = 0; j < attributes.getLength(); j++) {
                        Node attribute = attributes.item(j);
                        System.out.print(attribute.getNodeName() + " =" + attribute.getNodeValue());
                    }
                }
                if (childNode.getFirstChild() instanceof Text && !((Text) childNode.getFirstChild()).getData().trim().isEmpty()) {
                    System.out.print("->" + ((Text) childNode.getFirstChild()).getData().trim());
                }
                if (childNode.hasChildNodes()) {
                    System.out.println();
                    parse(childNode.getChildNodes());
                }
            }
        }
    }
}
