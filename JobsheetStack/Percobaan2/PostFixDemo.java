package JobsheetStack.Percobaan2;

public class PostFixDemo {
    public static boolean isOperand (char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')
                || (c >= '0' && c <= '9') || (c == ' ' || c == '.'));
    }

    public static boolean isOperator (char c) {
        return (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+');
    }

    public static int getDerajat (char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public static String konversi (String infix) {
        Stack operators = new Stack (infix.length());
        String postfix = "";
        char c;

        for (int i = 0; i < infix.length(); i++) {
            c = infix.charAt(i);

            if (isOperand(c)) {
                postfix = postfix + c;
            }
            else if (c == '(') {
                operators.push(c);
            }
            else if (c == ')') {
                while (operators.peek() != '(') {
                    postfix = postfix + operators.pop();
                }
                operators.pop();
            }
            else if (isOperator (c)) {
                while (getDerajat (operators.peek()) >= getDerajat(c)) {
                    postfix = postfix + operators.pop();
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty()) {
            postfix += operators.pop();
        }
        return postfix;
        }

    public static int hitungHasil(String postfix) {
        Stack operands = new Stack(postfix.length());
        char c;
        
        for (int i = 0; i < postfix.length(); i++) {
            c = postfix.charAt(i);
        
            if (isOperand(c)) {
                operands.push(c); // Push operand sebagai karakter
            } else if (isOperator(c)) {
                int operand2 = operands.pop() - '0';
                int operand1 = operands.pop() - '0';
                int result = 0;
        
                switch (c) {
                    case '^':
                        result = (int) Math.pow(operand2, operand1);
                        break;
                    case '%':
                        result = operand2 % operand1;
                        break;
                    case '/':
                        result = operand2 / operand1;
                        break;
                    case '*':
                        result = operand2 * operand1;
                        break;
                    case '-':
                        result = operand2 - operand1;
                        break;
                    case '+':
                        result = operand2 + operand1;
                        break;
                    }
        
                operands.push((char) (result + '0')); // Push hasil operasi sebagai karakter
                }
            }
        
            // Hasil akhir berada di puncak stack
            return operands.pop() - '0'; // Mengembalikan hasil sebagai angka
        }
        
        

        public static void main(String[] args) {
            String infix = "5*4^(1+2)%3";
            System.out.println("Infix: " + infix);
            
            String postfix = konversi(infix);
            System.out.println("Postfix: " + postfix);
            
            int hasil = hitungHasil(postfix);
            System.out.println("Hasil: " + hasil);
        }
        // String infix = "5*4^(1+2)%3";
        // System.out.println("Infix: " + infix);
        // System.out.println("Postfix: " + konversi(infix));
}
