package module4.projects.ucell.service.manager;

public interface FreezeService {
    boolean freeze(String phoneId);
    boolean unfreeze(String phoneId);
}