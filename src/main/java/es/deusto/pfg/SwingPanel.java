package es.deusto.pfg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.SwingConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class SwingPanel extends JFrame{

	/**
	 * Create the application.
	 */
	public SwingPanel(ArrayList<Producto> productos) {
		initialize(productos);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(final ArrayList<Producto> productos) {
		setBounds(100, 100, 938, 609);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Eroski Panel de Control");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblNewLabel.setBounds(261, 36, 364, 47);
		getContentPane().add(lblNewLabel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(626, 132, 159, 21);
		getContentPane().add(comboBox_1);
		
		final JPanel panel = new JPanel();
		panel.setBounds(22, 184, 411, 348);
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(484, 184, 411, 348);
		getContentPane().add(panel_1);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Elegir opoción", "Por fecha de compra", "Por fecha de consumición", "Por marca", "Por producto"}));
		comboBox.setBounds(137, 132, 159, 21);
		getContentPane().add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectionCombo = comboBox.getSelectedIndex();
				switch(selectionCombo) {
				case 0:
					panel.removeAll();
					panel.revalidate();
					panel.repaint();
					break;
				case 1:
					panel.removeAll();
					panel.revalidate();
					panel.repaint();
					DefaultCategoryDataset datos_fcom = new DefaultCategoryDataset();
					for(Producto producto1: productos) {
						int cont_productos = 0;
						for(Producto producto2: productos) {
							if(producto1.getFechacompr().equals(producto2.getFechacompr())) {
								cont_productos++;
							}
						}
						datos_fcom.setValue(cont_productos, "Fecha Compra", producto1.getFechacompr());
					}
					
					JFreeChart graficoFCom = ChartFactory.createBarChart3D(
						"Productos por fecha de compra",
						"Fecha",
						"Productos",
						datos_fcom,
						PlotOrientation.VERTICAL,
						false,
						true,
						false
					);
					
					ChartPanel panel_graficofcom = new ChartPanel(graficoFCom);
					panel_graficofcom.setMouseWheelEnabled(true);
					panel_graficofcom.setPreferredSize(new Dimension(411, 348));
					panel.add(panel_graficofcom);
					
					setMinimumSize(getSize());
					pack();
					setMinimumSize(null);
					repaint();
					break;
					
				case 2:
					panel.removeAll();
					panel.revalidate();
					panel.repaint();
					DefaultCategoryDataset datos_fcons = new DefaultCategoryDataset();
					for(Producto producto1: productos) {
						int cont_productos = 0;
						for(Producto producto2: productos) {
							if(producto1.getFechacons().equals(producto2.getFechacons())) {
								cont_productos++;
							}
						}
						datos_fcons.setValue(cont_productos, "Fecha Consumición", producto1.getFechacons());
					}
					JFreeChart graficoFCons = ChartFactory.createBarChart3D(
						"Productos por fecha de consumición",
						"Fecha",
						"Productos",
						datos_fcons,
						PlotOrientation.VERTICAL,
						false,
						true,
						false
					);
					ChartPanel panel_graficofcons = new ChartPanel(graficoFCons);
					panel_graficofcons.setMouseWheelEnabled(true);
					panel_graficofcons.setPreferredSize(new Dimension(411, 348));
					panel.add(panel_graficofcons);
					
					setMinimumSize(getSize());
					pack();
					setMinimumSize(null);
					repaint();
					break;
				case 3:
					panel.removeAll();
					panel.revalidate();
					panel.repaint();
					DefaultCategoryDataset datos_marca = new DefaultCategoryDataset();
					for(Producto producto1: productos) {
						int cont_productos = 0;
						for(Producto producto2: productos) {
							if(producto1.getMarca().equals(producto2.getMarca())) {
								cont_productos++;
							}
						}
						datos_marca.setValue(cont_productos, "Marca", producto1.getMarca());
					}
					JFreeChart graficoMarca = ChartFactory.createBarChart3D(
						"Productos por marca",
						"Marca",
						"Productos",
						datos_marca,
						PlotOrientation.VERTICAL,
						false,
						true,
						false
					);
					ChartPanel panel_graficomarca = new ChartPanel(graficoMarca);
					panel_graficomarca.setMouseWheelEnabled(true);
					panel_graficomarca.setPreferredSize(new Dimension(411, 348));
					panel.add(panel_graficomarca);
					
					setMinimumSize(getSize());
					pack();
					setMinimumSize(null);
					repaint();
					break;
				case 4:
					panel.removeAll();
					panel.revalidate();
					panel.repaint();
					DefaultCategoryDataset datos_nombre = new DefaultCategoryDataset();
					for(Producto producto1: productos) {
						int cont_productos = 0;
						for(Producto producto2: productos) {
							if(producto1.getNombre().equals(producto2.getNombre())) {
								cont_productos++;
							}
						}
						datos_nombre.setValue(cont_productos, "Nombre", producto1.getNombre());
					}
					JFreeChart graficoNombre = ChartFactory.createBarChart3D(
						"Productos por nombre",
						"Nombre",
						"Productos",
						datos_nombre,
						PlotOrientation.VERTICAL,
						false,
						true,
						false
					);
					ChartPanel panel_graficonombre = new ChartPanel(graficoNombre);
					panel_graficonombre.setMouseWheelEnabled(true);
					panel_graficonombre.setPreferredSize(new Dimension(411, 348));
					panel.add(panel_graficonombre);
					
					setMinimumSize(getSize());
					pack();
					setMinimumSize(null);
					repaint();
					break;
				}
				
			}
		});
		
	}
}
