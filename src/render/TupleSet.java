package render;

import java.util.ArrayList;
import java.util.List;

import gdecid.visual.tuple.TableVisualItem;

public class TupleSet {
	List<Object> Nodes;
	
	public void init() {
		Nodes = new ArrayList<Object>();
		Nodes.add(new TableVisualItem("����"));
		Nodes.add(new TableVisualItem("�Ϻ�"));
		Nodes.add(new TableVisualItem("����"));
		Nodes.add(new TableVisualItem("����"));
		Nodes.add(new TableVisualItem("���"));
	}

	public List<Object> getNodes() {
		return Nodes;
	}

	public void setNodes(List<Object> nodes) {
		Nodes = nodes;
	}


}
