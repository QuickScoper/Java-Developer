package Lesson8.ClassWork.GuiForShop;




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Date;
import java.util.List;


public class TechShopUi extends JFrame {

    private bestBirds shop;


    public TechShopUi(bestBirds shop) {

        this.shop = shop;

        JFrame jF = new JFrame();
        jF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jF.setLocation(560, 240);
        jF.setMinimumSize(new Dimension(800, 600));

        jF.getContentPane().add(techShopPanel());

        jF.setVisible(true);


        jF.pack();

    }


    private JPanel techShopPanel() {


        JPanel jP = new JPanel();
        jP.setLayout(new GridBagLayout());

        JLabel nameLabel = new JLabel("Your name: ");
        JTextField textName = new JTextField();
        textName.setColumns(30);
        jP.add(nameLabel, new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(0,0,0,0),0,0));
        jP.add(textName, new GridBagConstraints(1,0,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(0,0,0,0),0,0));
        JLabel birds = new JLabel("Birds: ");
        List<product> product = shop.getProducts();
        ButtonGroup productGroup = new ButtonGroup();

        JPanel bProduct = new JPanel();
        bProduct.setLayout(new GridLayout(product.size(),0));
        bProduct.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        int i = 0;
        for (product p : product) {
            JRadioButton rb = new JRadioButton(p.getType() + ": " + p.getCost());
            rb.setActionCommand("" + i);
            productGroup.add(rb);
            bProduct.add(rb);
            i++;
        }

        jP.add(birds, new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(5,0,0,0),0,0));
        jP.add(bProduct, new GridBagConstraints(1,1,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(5,0,0,0),0,0));

        JLabel numberOfProductLabel = new JLabel("Number:");
        NumberFormat nf = NumberFormat.getNumberInstance();
        JFormattedTextField ff = new JFormattedTextField(nf);
        ff.setValue(1);
        ff.setColumns(3);

        jP.add(numberOfProductLabel, new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(5,0,0,0),0,0));
        jP.add(ff, new GridBagConstraints(1,2,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(5,0,0,0),0,0));

        JButton buyBotton = new JButton("Buy");
        buyBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jP, new Date() + "\n" + "Transaction complete! " + "\n" + textName.getText() + ", total sum is : " +
                                product.get(Integer.parseInt(productGroup.getSelection().getActionCommand())).getCost()*Integer.parseInt(ff.getText())
                        + "$." + "\n" + "Thanks for your transaction!" + "\n" + "Goodbye.");
            }
        });
        jP.add(buyBotton, new GridBagConstraints(1,3,1,1,0,0,GridBagConstraints.LINE_START,0,new Insets(5,0,0,0),0,0));




//        JRadioButton productBottom1 = new JRadioButton();


//        JRadioButton productBottom2 = new JRadioButton();

//        jP.add(productBottom1);
//        jP.add(productBottom2);

        return jP;
    }


}
