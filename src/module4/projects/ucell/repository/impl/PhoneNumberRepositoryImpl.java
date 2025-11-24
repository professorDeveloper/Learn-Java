package module4.projects.ucell.repository.impl;

import module4.projects.ucell.domain.PhoneNumber;
import module4.projects.ucell.repository.PhoneNumberRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PhoneNumberRepositoryImpl implements PhoneNumberRepository {

    private final String FILE = "numbers.txt";
    private List<PhoneNumber> numbers = new ArrayList<>();

    public PhoneNumberRepositoryImpl() {
        readFromFile();
    }

    @Override
    public List<PhoneNumber> getAll() {
        return numbers;
    }

    @Override
    public PhoneNumber findById(String id) {
        for (PhoneNumber n : numbers) {
            if (n.getId().equals(id)) {
                return n;
            }
        }
        return null;
    }

    @Override
    public PhoneNumber findByNumber(String number) {
        for (PhoneNumber n : numbers) {
            if (n.getNumber().equals(number)) {
                return n;
            }
        }
        return null;
    }

    @Override
    public void save(PhoneNumber number) {
        numbers.add(number);
        writeToFile();
    }

    @Override
    public void update(PhoneNumber updated) {
        writeToFile();
    }

    @Override
    public void delete(String id) {
        boolean b = numbers.removeIf(n -> n.getId().equals(id));
        if (b) {
            writeToFile();
        }
    }

    @Override
    public void writeToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {
            oos.writeObject(numbers);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readFromFile() {
        File file = new File(FILE);
        if (!file.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {
            List<PhoneNumber> numbers1 = (List<PhoneNumber>) ois.readObject();
            numbers = numbers1;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
