package com.dwman.preformmanagesystem.user;

/**
 * Created by ldw on 2018/4/9.
 */
public class UserFactory {
    public static BaseUser createNewUser(int mCurrentStatus) {
        BaseUser baseUser;
        switch (mCurrentStatus){
            case 1:
                baseUser = new SystemManager();
                baseUser.currentStatus = UserContext.STATUS_SYSTEM_MANAGER;
                break;
            case 2:
                baseUser = new ProjectManager();
                 baseUser.currentStatus = UserContext.STATUS_PROJECT_MANAGER;
                break;
            case 3:
                baseUser = new StorageManager();
                 baseUser.currentStatus = UserContext.STATUS_STORAGE_MANAGER;
                break;
            case 4:
                baseUser = new WorkshopManager();
                 baseUser.currentStatus = UserContext.STATUS_WORKSHOP_MANAGER;
                break;
            case 5:
                baseUser = new QualityInspector();
                 baseUser.currentStatus = UserContext.STATUS_QUALITY_INSPECTOR;
                break;
            default:
                baseUser = new Guest();
                 baseUser.currentStatus = UserContext.STATUS_GUEST;
                break;
        }
        return baseUser;
    }
}
