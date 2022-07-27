package homework.collection;

import java.util.*;

public class MapExample {
    static Map<Integer, String> footballTeam = new HashMap<>();
    static List<FootballTeamMember> teamMembers = new ArrayList<>();


    public static void main(String[] args) {
        teamMembers.add(0, new FootballTeamMember(10, "Pique"));
        teamMembers.add(1, new FootballTeamMember(7, "Zidane"));
        teamMembers.add(2, new FootballTeamMember(3, "Messi"));
        System.out.println(createFootballTeam(teamMembers));
        System.out.println(removeFromMap(footballTeam, 0));
        printAllMemberNames(footballTeam);
        printAllMembers(footballTeam);

    }

    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։
    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {
        for (FootballTeamMember member : members) {
            footballTeam.put(member.getNumber(), member.getName());
        }

        return footballTeam;
    }

    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {
        for (Integer integer : memberMap.keySet()) {
            return memberMap.remove(removedNumber, memberMap.get(removedNumber));
        }
        return false;
    }

    //Մեթոդով տպելու ենք միայն անունները
    static void printAllMemberNames(Map<Integer, String> memberMap) {
        for (Integer integer : memberMap.keySet()) {
            System.out.println(memberMap.get(integer));
        }
    }

    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
    // 11 - Poxos Poxosyan
    // 12 - Petros Petrosyan
    static void printAllMembers(Map<Integer, String> memberMap) {
        for (Integer integer : memberMap.keySet()) {
            System.out.println(integer + " - " + memberMap.get(integer));
        }
    }

    static class FootballTeamMember {
        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

    }

}



