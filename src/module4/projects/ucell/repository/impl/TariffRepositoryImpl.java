package module4.projects.ucell.repository.impl;


import module4.projects.ucell.domain.Tariff;
import module4.projects.ucell.repository.TariffRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TariffRepositoryImpl implements TariffRepository {

    private final String FILE = "tariffs.txt";
    private List<Tariff> tariffs = new ArrayList<>();

    public TariffRepositoryImpl() {
        readFromFile();
    }

    @Override
    public List<Tariff> getAll() {
        return tariffs;
    }

    @Override
    public Tariff findById(String id) {
        for (Tariff t : tariffs) {
            if (t.getId().equals(id)) return t;
        }
        return null;
    }

    @Override
    public Tariff findByName(String name) {
        for (Tariff t : tariffs) {
            if (t.getName().equals(name)) return t;
        }
        return null;
    }

    @Override
    public void save(Tariff tariff) {
        tariffs.add(tariff);
        writeToFile();
    }

    @Override
    public boolean update(Tariff updated) {
        for (Tariff t : tariffs) {
            if (t.getId().equals(updated.getId())) {
                t.setName(updated.getName());
                t.setPrice(updated.getPrice());
                t.setDescription(updated.getDescription());
                writeToFile();
                return true;
            }

        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        boolean b = tariffs.removeIf(t -> t.getId().equals(id));
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
            oos.writeObject(tariffs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readFromFile() {
        File file = new File(FILE);
        if (!file.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {
            tariffs = (List<Tariff>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
