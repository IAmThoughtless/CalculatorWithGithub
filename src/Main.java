if (e.getSource() == clrButton) {
    textfield.setText("");
}

if (e.getSource() == delButton) {
    String string = textfield.getText();
    textfield.setText("");
    for(int i=0;i<string.length()-1;i++) {
        textfield.setText(textfield.getText()+string.charAt(i));
    }
}

if (e.getSource() == negButton) {
    double temp = Double.parseDouble(textfield.getText());
    temp*=-1;
    textfield.setText(String.valueOf(temp));
}