import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;

class HtmlTest {

	@Test
	void test() {
		Node html = new Node("html", null);
		Node head = new Node("head", null);
		html.addChild(head);
		Node title = new Node(null, "JLearner");
		title.addChild(titleText);
		Node body = new Node("body",null);
		html.addChild(body);
		Node h1 = new Node("h1", null);
		body.addChild(h1Text);
		body.addChild(p);
				
	}

}
