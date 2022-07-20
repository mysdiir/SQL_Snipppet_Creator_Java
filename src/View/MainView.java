package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

import static javax.swing.BoxLayout.LINE_AXIS;

public class MainView extends JFrame {

    private JPanel mainPanel;
    private JPanel dbSettingsPanel;
    private JPanel dataprocessingPanel;
    private JPanel snippetPanel;
    private JTextField hostField;
    private JTextField usernameTextField;
    private JTextField passwordField;
    private JTextField databaseField;
    private JTextField tableField;
    private JTextField portField;
    private JButton settingsBtn;
    private JButton copyToClipboardButton;
    private JButton insertIntoDatabaseButton;
    private JScrollPane datavalueAdditionScrollPane;
    private JPanel datavalueAdditionPanel;
    private JScrollPane newDatavaluePreviewScrollPane;
    private JPanel newDatValuePreviewPanel;
    private JScrollPane databasePreviewScrollPane;
    private JPanel databasePreviewPanel;
    private JPanel test;
    private JTextField textField1;
    private JButton button1;
    private JTable dbTable;
    private JTextArea insertIntoDatabaseTableTextArea;

    public MainView() {
        MainView mainView = this;
        setTitle("SQL Snippet Creator - Java Edition");
        setSize(1024, 768);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        addComponent();
        pack();
        setVisible(true);
    }

    public void addComponent() {

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.setMinimumSize(new Dimension(1024, 768));
        mainPanel.setPreferredSize(new Dimension(1024, 768));
                add(mainPanel);

        dbSettingsPanel = new JPanel();
                dbSettingsPanel.setLayout(new GridBagLayout());
                dbSettingsPanel.setBackground(new Color(-1015680));
                dbSettingsPanel.setMaximumSize(new Dimension(0, 0));
                dbSettingsPanel.setMinimumSize(new Dimension(0, 0));
                dbSettingsPanel.setPreferredSize(new Dimension(0, 0));
                dbSettingsPanel.setOpaque(true);
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.gridheight = 3;
                gbc.weightx = 1.0;
                gbc.weighty = 1.0;
                gbc.fill = GridBagConstraints.BOTH;
                gbc.insets = new Insets(10, 5, 5, 10);
                mainPanel.add(dbSettingsPanel, gbc);

            hostField = new JTextField();
                hostField.setMaximumSize(new Dimension(0, 30));
                hostField.setMinimumSize(new Dimension(0, 30));
                hostField.setPreferredSize(new Dimension(0, 30));
                hostField.setText("host");
                gbc = new GridBagConstraints();
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.weightx = 2.0;
                gbc.anchor = GridBagConstraints.WEST;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                dbSettingsPanel.add(hostField, gbc);

            usernameTextField = new JTextField();
                usernameTextField.setMaximumSize(new Dimension(0, 30));
                usernameTextField.setMinimumSize(new Dimension(0, 30));
                usernameTextField.setOpaque(false);
                usernameTextField.setPreferredSize(new Dimension(0, 30));
                usernameTextField.setText("username");
                gbc = new GridBagConstraints();
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.anchor = GridBagConstraints.WEST;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                dbSettingsPanel.add(usernameTextField, gbc);

            passwordField = new JTextField();
                passwordField.setMaximumSize(new Dimension(0, 30));
                passwordField.setMinimumSize(new Dimension(0, 30));
                passwordField.setPreferredSize(new Dimension(0, 30));
                passwordField.setText("password");
                gbc = new GridBagConstraints();
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.anchor = GridBagConstraints.WEST;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                dbSettingsPanel.add(passwordField, gbc);

            databaseField = new JTextField();
                databaseField.setMaximumSize(new Dimension(0, 30));
                databaseField.setMinimumSize(new Dimension(0, 30));
                databaseField.setPreferredSize(new Dimension(0, 30));
                databaseField.setText("database");
                gbc = new GridBagConstraints();
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.anchor = GridBagConstraints.WEST;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                dbSettingsPanel.add(databaseField, gbc);

            tableField = new JTextField();
                tableField.setMaximumSize(new Dimension(0, 30));
                tableField.setMinimumSize(new Dimension(0, 30));
                tableField.setPreferredSize(new Dimension(0, 30));
                tableField.setText("table");
                gbc = new GridBagConstraints();
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.anchor = GridBagConstraints.WEST;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                dbSettingsPanel.add(tableField, gbc);

            portField = new JTextField();
                portField.setMaximumSize(new Dimension(0, 30));
                portField.setMinimumSize(new Dimension(0, 30));
                portField.setPreferredSize(new Dimension(0, 30));
                portField.setText("port");
                gbc = new GridBagConstraints();
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.anchor = GridBagConstraints.WEST;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                dbSettingsPanel.add(portField, gbc);

            final JPanel spacer1 = new JPanel();
                spacer1.setBackground(new Color(-1015680));
                gbc = new GridBagConstraints();
                gbc.gridx = 1;
                gbc.gridy = 6;
                gbc.fill = GridBagConstraints.VERTICAL;
                dbSettingsPanel.add(spacer1, gbc);

            settingsBtn = new JButton();
                settingsBtn.setMaximumSize(new Dimension(0, 30));
                settingsBtn.setMinimumSize(new Dimension(0, 30));
                settingsBtn.setPreferredSize(new Dimension(0, 30));
                settingsBtn.setText("Button");
                gbc = new GridBagConstraints();
                gbc.gridx = 1;
                gbc.gridy = 7;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                dbSettingsPanel.add(settingsBtn, gbc);

            final JPanel spacer2 = new JPanel();
                spacer2.setBackground(new Color(-1015680));
                gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                dbSettingsPanel.add(spacer2, gbc);

            final JPanel spacer3 = new JPanel();
                spacer3.setBackground(new Color(-1015680));
                gbc = new GridBagConstraints();
                gbc.gridx = 2;
                gbc.gridy = 0;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                dbSettingsPanel.add(spacer3, gbc);

        snippetPanel = new JPanel();
            snippetPanel.setLayout(new BorderLayout(0, 0));
            snippetPanel.setBackground(new Color(-24454));
            gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 3;
            gbc.weightx = 1.0;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.insets = new Insets(5, 10, 5, 5);
            mainPanel.add(snippetPanel, gbc);

            insertIntoDatabaseTableTextArea = new JTextArea();
                insertIntoDatabaseTableTextArea.setDragEnabled(false);
                insertIntoDatabaseTableTextArea.setLineWrap(true);
                insertIntoDatabaseTableTextArea.setMargin(new Insets(100, 50, 0, 0));
                insertIntoDatabaseTableTextArea.setMinimumSize(new Dimension(100, 100));
                insertIntoDatabaseTableTextArea.setPreferredSize(new Dimension(50, 200));
                insertIntoDatabaseTableTextArea.setText("INSERT INTO database.table (column1, column2, column3) VALUES (1,2,3);");
                snippetPanel.add(insertIntoDatabaseTableTextArea, BorderLayout.CENTER);

        dataprocessingPanel = new JPanel();
            dataprocessingPanel.setLayout(new GridBagLayout());
            dataprocessingPanel.setBackground(new Color(-329006));
            dataprocessingPanel.setMaximumSize(new Dimension(0, 0));
            dataprocessingPanel.setMinimumSize(new Dimension(0, 0));
            dataprocessingPanel.setPreferredSize(new Dimension(0, 0));
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 3;
            gbc.weightx = 1.0;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.insets = new Insets(5, 5, 5, 10);
            mainPanel.add(dataprocessingPanel, gbc);

            copyToClipboardButton = new JButton();
                copyToClipboardButton.setMaximumSize(new Dimension(150, 30));
                copyToClipboardButton.setMinimumSize(new Dimension(150, 30));
                copyToClipboardButton.setPreferredSize(new Dimension(150, 30));
                copyToClipboardButton.setText("copy to clipboard");
                gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                dataprocessingPanel.add(copyToClipboardButton, gbc);

            final JPanel spacer4 = new JPanel();
                gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 1;
                gbc.fill = GridBagConstraints.VERTICAL;
                dataprocessingPanel.add(spacer4, gbc);

            insertIntoDatabaseButton = new JButton();
                insertIntoDatabaseButton.setMaximumSize(new Dimension(150, 30));
                insertIntoDatabaseButton.setMinimumSize(new Dimension(150, 30));
                insertIntoDatabaseButton.setPreferredSize(new Dimension(150, 30));
                insertIntoDatabaseButton.setText("insert into database");
                gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 2;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                dataprocessingPanel.add(insertIntoDatabaseButton, gbc);


            datavalueAdditionScrollPane = new JScrollPane();
                datavalueAdditionScrollPane.setBackground(new Color(-5383962));
                datavalueAdditionScrollPane.setMaximumSize(new Dimension(0, 0));
                datavalueAdditionScrollPane.setMinimumSize(new Dimension(0, 0));
                datavalueAdditionScrollPane.setPreferredSize(new Dimension(0, 0));
                gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 1;
                gbc.weightx = 3.0;
                gbc.weighty = 1.0;
                gbc.fill = GridBagConstraints.BOTH;
                gbc.insets = new Insets(10, 10, 5, 5);
                datavalueAdditionScrollPane.setBorder(BorderFactory.createTitledBorder(
                        BorderFactory.createEtchedBorder(),
                        null, TitledBorder.DEFAULT_JUSTIFICATION,
                        TitledBorder.DEFAULT_POSITION,
                        null, null));
                mainPanel.add(datavalueAdditionScrollPane, gbc);

        datavalueAdditionPanel = new JPanel();
                datavalueAdditionPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
                datavalueAdditionPanel.setBackground(new Color(-5383962));
                datavalueAdditionScrollPane.setViewportView(datavalueAdditionPanel);



        newDatavaluePreviewScrollPane = new JScrollPane();
                newDatavaluePreviewScrollPane.setMaximumSize(new Dimension(0, 0));
                newDatavaluePreviewScrollPane.setMinimumSize(new Dimension(0, 0));
                newDatavaluePreviewScrollPane.setPreferredSize(new Dimension(0, 4));
                gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 2;
                gbc.weightx = 1.0;
                gbc.weighty = 1.0;
                gbc.fill = GridBagConstraints.BOTH;
                gbc.insets = new Insets(5, 10, 5, 5);
                newDatavaluePreviewScrollPane.setBorder(BorderFactory.createTitledBorder(
                        BorderFactory.createEtchedBorder(),
                        null, TitledBorder.DEFAULT_JUSTIFICATION,
                        TitledBorder.DEFAULT_POSITION,
                        null, null));
                mainPanel.add(newDatavaluePreviewScrollPane, gbc);

        newDatValuePreviewPanel = new JPanel();
            newDatValuePreviewPanel.setLayout(new GridBagLayout());
            newDatValuePreviewPanel.setAlignmentX(0.5f);
            newDatValuePreviewPanel.setBackground(new Color(-7357297));
            newDatavaluePreviewScrollPane.setViewportView(newDatValuePreviewPanel);

        databasePreviewScrollPane = new JScrollPane();
        databasePreviewScrollPane.setMaximumSize(new Dimension(0, 0));
        databasePreviewScrollPane.setMinimumSize(new Dimension(0, 0));
        databasePreviewScrollPane.setPreferredSize(new Dimension(0, 0));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.weightx = 3.0;
        gbc.weighty = 2.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 10, 10, 10);
        mainPanel.add(databasePreviewScrollPane, gbc);



        databasePreviewPanel = new JPanel();
            databasePreviewScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
            databasePreviewPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
            databasePreviewPanel.setBackground(new Color(-14634326));
            databasePreviewPanel.setFocusable(false);
            databasePreviewPanel.setMaximumSize(new Dimension(0, 0));
            databasePreviewScrollPane.setViewportView(databasePreviewPanel);



        dbTable = new JTable();
            dbTable.setAutoResizeMode(2);
            dbTable.setDropMode(DropMode.USE_SELECTION);
            dbTable.setMaximumSize(new Dimension(0, 0));
            dbTable.setMinimumSize(new Dimension(0, 0));
            dbTable.setPreferredSize(new Dimension(990, 225));
            dbTable.setShowHorizontalLines(true);
            dbTable.setShowVerticalLines(true);
            databasePreviewPanel.add(dbTable);
    }

    public String getHost() {
        return this.hostField.getText();
    }

    public String getUsername() {
        return this.usernameTextField.getText();
    }

    public String getPassword() {
        return this.passwordField.getText();
    }

    public String getDatabase() {
        return this.databaseField.getText();
    }

    public String getTable() {
        return this.databaseField.getText();
    }

    public String getPort() {
        return this.portField.getText();
    }

}