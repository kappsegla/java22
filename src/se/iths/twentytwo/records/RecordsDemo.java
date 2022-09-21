package se.iths.twentytwo.records;

public class RecordsDemo {

    public static void main(String[] args) {
        Person donald = new Person("Donald","Duck",88);

        System.out.println(donald);
        System.out.println(donald.getFirstName());

        RPerson donaldAsRecord = new RPerson("Donald","Duck",88);
        System.out.println(donaldAsRecord);
        System.out.println(donaldAsRecord.firstName());
    }
}
