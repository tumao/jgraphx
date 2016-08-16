import javax.swing.JFrame;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

import example.com.mxgraph.examples.swing.editor.*;

public class test
{
	JFrame frame;
	EditorToolBar toolbar;
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		frame = new JFrame("测试");

	}
	
	public void init()
	{
		frame = new JFrame("影响图");
		frame.setBounds(300,100,500,600);
		
		final mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();	// 返回图中根节点的第一个孩子
		graph.getModel().beginUpdate();
		
		mxGraph2Component component = new mxGraphComponent();
		BasicGraphEditor editor = new BasicGraphEditor();
		
		toolbar = new EditorToolBar();
	}

}
