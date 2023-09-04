/*
 * Disclaimer: Here are only questions about the naruto series.
 */

public class Questions {
    private int[] id;
    private String[] question;
    private String[] options;
    private char[] answeres;
    private int score;

    public Questions() {
        // total questions
        final int tq = 5;

        id = new int[tq];
        question = new String[tq];
        options = new String[tq];
        answeres = new char[tq];

        int number = 1;
        id[number] = number;
        question[number] = "Q-" + number + ". Who is known as the 'Copy Ninja'";
        options[number] = "A. Saske  B. Naruto  C. Kakashi sensei  D. Master Jiraya";
        answeres[number] = 'C';

        number++;
        id[number] = number;
        question[number] = "Q-" + number + ". How many kage is there?";
        options[number] = "A. 2  B. 3  C. 4  D. 5";
        answeres[number] = 'D';

        number++;
        id[number] = number;
        question[number] = "Q-" + number + ". Who is naruto's first sensei?";
        options[number] = "A. Iruka sensei  B. Kakashi sensei  C. Jiraya sensei D. Tsunade";
        answeres[number] = 'A';

        number++;
        id[number] = number;
        question[number] = "Q-" + number + ". Naruto's team number?";
        options[number] = "A. 10  B. 9  C. 8 D. 7";
        answeres[number] = 'D';

    }

    public void ShowQuestion(int index) {
        System.out.println(question[index]);
        System.out.println(options[index]);
    }

    private char getAns(int index) {
        return answeres[index];
    }

    public void CalculateStore(int id, char ans) {
        char r = getAns(id);
        if (r == ans) {
            score++;
        }
    }

    public int GetScore() {
        return score;
    }

}
