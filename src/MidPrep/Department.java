package MidPrep;

import MidPrep.Position;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String location;
    List<Position> positionList;
    private Company company;

    public Department(String name, String location, Company company) {
        this.name = name;
        this.location = location;
        this.company = company;
        positionList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Company getCompany() {
        return company;
    }
    public void print(){
        for (Position p: positionList){
            System.out.println("title "+ p.getTitle() + "description" + p.getDescription());
        }
    }
    public void addPosition(Position position){
        positionList.add(position);
    }
}
