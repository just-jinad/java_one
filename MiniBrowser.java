import javax.swing.*;

public class MiniBrowser {
    public static void main(String[] args) {
        System.out.println("System check");

        JFrame myBrowserFrame = new JFrame("Mini Browser");

        myBrowserFrame.setSize(600, 800);
        myBrowserFrame.setLayout(null);

        JTextField urlInput = new JTextField();
        urlInput.setBounds(10, 10, 600, 30);
        myBrowserFrame.add(urlInput);

        JButton searchButton = new JButton("Search");
        searchButton.setBounds(620, 10, 100, 30);
        myBrowserFrame.add(searchButton);

        myBrowserFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myBrowserFrame.setVisible(true);
    }
}