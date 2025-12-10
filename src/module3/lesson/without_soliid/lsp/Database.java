package module3.lesson.without_soliid.lsp;


public interface Database {
    void save();

    void delete();

    Object get();

    void createTable();
}

class PostgresSQLDatabase implements Database {

    @Override
    public void save() {

    }

    @Override
    public void delete() {

    }

    @Override
    public Object get() {
        return null;
    }

    @Override
    public void createTable() {

    }
}

class MongoDB implements Database {

    @Override
    public void save() {

    }

    @Override
    public void delete() {

    }

    @Override
    public Object get() {
        return null;
    }

    @Override
    public void createTable() {

    }
}
