package QueueAndList.QueueBasics.QueueSimpleOperations;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestNumberQueue {
    public static void main(String[] args) {

        NumberQueue nqTest=new NumberQueue();

        nqTest.addNumber(10);
        nqTest.addNumber(20);
        nqTest.addNumber(30);

        nqTest.removeNumber();
        nqTest.showFront();
        nqTest.addNumber(40);
        nqTest.showAll();
        }
    }
