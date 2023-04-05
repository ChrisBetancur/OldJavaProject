package Engine.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FilterDialog {
    private JList filterList;

    public FilterDialog(JFrame frame,String[] list) {
        initFilterList(list);
        filterList.setCellRenderer(new FilterRenderer());
        filterList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        filterList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                /*JList list = (JList) event.getSource();
                int index = list.locationToIndex(event.getPoint());// Get index of item
                // clicked
                CheckListItem item = (CheckListItem) list.getModel()
                        .getElementAt(index);
                item.setSelected(!item.isSelected()); // Toggle selected state
                list.repaint(list.getCellBounds(index, index));// Repaint cell*/
            }
        });
        frame.getContentPane().add(new JScrollPane(filterList));
        //frame.pack();
        frame.setVisible(true);
    }

    private void initFilterList(String[] filters) {
        FilterItem[] tempList = new FilterItem[filters.length];
        for(int i = 0; i < filters.length; i++) {
            tempList[i] = new FilterItem(filters[i]);
        }
        filterList = new JList(tempList);
    }

    private static class FilterItem {
        private String label;
        private boolean isSelected = false;

        public FilterItem(String label) {
            this.label = label;
        }

        public boolean isSelected() {
            return isSelected;
        }

        public void setSelected(boolean isSelected) {
            this.isSelected = isSelected;
        }

        @Override
        public String toString() {
            return label;
        }
    }
    private static class FilterRenderer extends JCheckBox implements ListCellRenderer {
        public Component getListCellRendererComponent(JList list, Object value,
                                                      int index, boolean isSelected, boolean hasFocus) {
            setEnabled(list.isEnabled());
            setSelected(((FilterItem) value).isSelected());
            setFont(list.getFont());
            setBackground(list.getBackground());
            setForeground(list.getForeground());
            setText(value.toString());
            return this;
        }
    }
}
