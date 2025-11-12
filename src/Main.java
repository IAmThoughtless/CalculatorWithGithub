//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    if (e.getSource() == addButton) {
        num1 = Double.parseDouble(textfield.getText());
        operator = '+';
        textfield.setText("");
    }


    if (e.getSource() == subButton) {
        num1 = Double.parseDouble(textfield.getText());
        operator = '-';
        textfield.setText("");
    }


    if (e.getSource() == mulButton) {
        num1 = Double.parseDouble(textfield.getText());
        operator = '*';
        textfield.setText("");
    }
    if (e.getSource() == divButton) {
        num1 = Double.parseDouble(textfield.getText());
        operator = '/';
        textfield.setText("");
    }
    if (e.getSource() == equButton) {
        num2 = Double.parseDouble(textfield.getText());

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                ;
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
    }
}

