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
//		frame = new JFrame("����");

	}
	
	public void init()
	{
		frame = new JFrame("Ӱ��ͼ");
		frame.setBounds(300,100,500,600);
		
		final mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();	// ����ͼ�и��ڵ�ĵ�һ������
		graph.getModel().beginUpdate();
		
		mxGraph2Component component = new mxGraphComponent();
		BasicGraphEditor editor = new BasicGraphEditor();
		
		toolbar = new EditorToolBar();
	}

}
