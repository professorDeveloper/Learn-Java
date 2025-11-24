package module4.projects.ucell.repository.impl;


import module4.projects.ucell.domain.UssdCode;
import module4.projects.ucell.repository.UssdRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UssdRepositoryImpl implements UssdRepository {

    private final String FILE = "ussd.txt";
    private List<UssdCode> codes = new ArrayList<>();

    public UssdRepositoryImpl() {
        readFromFile();
    }

    @Override
    public List<UssdCode> getAll() {
        return codes;
    }

    @Override
    public UssdCode findById(String id) {
        for (UssdCode c : codes) {
            if (c.getId().equals(id)) return c;
        }
        return null;
    }

    @Override
    public UssdCode findByCode(String code) {
        for (UssdCode c : codes) {
            if (c.getCode().equals(code)) return c;
        }
        return null;
    }

    @Override
    public void save(UssdCode code) {
        codes.add(code);
        writeToFile();
    }

    @Override
    public void update(UssdCode updated) {
        writeToFile();
    }

    @Override
    public boolean delete(String id) {
        boolean b = codes.removeIf(c -> c.getId().equals(id));
        if (b) {
            writeToFile();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void writeToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {
            oos.writeObject(codes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readFromFile() {
        File file = new File(FILE);
        if (!file.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {
            codes = (List<UssdCode>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
