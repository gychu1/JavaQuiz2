package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird {

    String migrationMonth;

    @Override
    public String getMigrationMonth() {
        return migrationMonth;
    }

    @Override
    public void setMigrationMonth(String migrationMonth) {
        this.migrationMonth = migrationMonth;
    }



    public int getSpeed() {
        return 10;
    }

    public String color() {
        return "red";
    }


}
