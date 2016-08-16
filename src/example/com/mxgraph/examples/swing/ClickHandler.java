package example.com.mxgraph.examples.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

import example.com.mxgraph.examples.swing.editor.BasicGraphEditor;
import example.com.mxgraph.examples.swing.editor.EditorToolBar;

public class ClickHandler extends JFrame
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2764911804288120883L;

	public ClickHandler()
	{
		super("Hello, World!");
		
		final mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();

		graph.getModel().beginUpdate();
		try
		{
		   Object v1 = graph.insertVertex(parent, null, "Hello", 20, 20, 80, 30);
		   Object v2 = graph.insertVertex(parent, null, "World!", 240, 150, 80, 30);
		   graph.insertEdge(parent, null, "Edge", v1, v2);
		}
		finally
		{
		   graph.getModel().endUpdate();
		}
		
		final mxGraphComponent graphComponent = new mxGraphComponent(graph);
		BasicGraphEditor editor = new BasicGraphEditor("editor title", graphComponent);
		EditorToolBar toolbar = new EditorToolBar(editor, 1);
		Container pane  = this.getContentPane();
		pane.add(toolbar, BorderLayout.NORTH);
		
		getContentPane().add(graphComponent);
		
		graphComponent.getGraphControl().addMouseListener(new MouseAdapter()
		{
		
			public void mouseReleased(MouseEvent e)
			{
				Object cell = graphComponent.getCellAt(e.getX(), e.getY());
				
				if (cell != null)
				{
					System.out.println("cell="+graph.getLabel(cell));
				}
			}
		});
	}

	public static void main(String[] args)
	{
		ClickHandler frame = new ClickHandler();
		
//		BasicGraphEditor editor =new BasicGraphEditor();
//		EditorToolBar toolbar = new EditorToolBar(editor, 1);	// 初始化工具栏
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Container pane = frame.getContentPane();
//		pane.add(toolbar, BorderLayout.NORTH);
		frame.setSize(400, 320);
		frame.setVisible(true);
	}

}
