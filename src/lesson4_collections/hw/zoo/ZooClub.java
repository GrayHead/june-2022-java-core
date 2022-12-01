package lesson4_collections.hw.zoo;

import java.util.*;


public class ZooClub {
    private Map<Person, List<Pet>> map = new LinkedHashMap<>();

    //1) додати учасника в клуб;
    public void addPersonToClub(Person person) {
        map.put(person, new ArrayList<>());
    }

//2) додати тваринку до учасника клубу.


    public void addPetToPerson(Person person, Pet pet) {
        List<Pet> pets = map.get(person);
        pets.add(pet);
    }


//    public void addPetToPerson(int personID, Pet pet) {
//        Iterator<Map.Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<Person, List<Pet>> next = iterator.next();
//            if (next.getKey().getId() == personID) {
//                next.getValue().add(pet);
//            }
//        }
//    }


//    public void addPetToPerson(int personID, Pet pet) {
//        Set<Person> people = map.keySet();
//        for (Person person : people) {
//            if (person.getId() == personID) {
//                List<Pet> pets = map.get(person);
//                pets.add(pet);
//            }
//        }
//    }


    //3) видалити тваринку з власника.
    public void deletePetFromPerson(Pet pet, Person person) {
        map.get(person).removeIf(p -> p.equals(pet));
    }

    //4) видалити учасника клубу.
    public void deletePersonFromClub(Person person) {
        map.remove(person);
    }

    //5) видалити конкретну тваринку з усіх власників.
    public void deletePet(Pet pet) {
//        Collection<List<Pet>> values = map.values();
//        Iterator<List<Pet>> iterator = values.iterator();
//        while (iterator.hasNext()) {
//            List<Pet> next = iterator.next();
//            next.removeIf(pet1 -> pet1.equals(pet));
//
//        }

//        Set<Map.Entry<Person, List<Pet>>> entries = map.entrySet();
//        entries.forEach(personPetsEntry -> {
//            List<Pet> value = personPetsEntry.getValue();
//            value.removeIf(pet1 -> pet1.equals(pet));
//        });

        map.entrySet()
                .forEach(personListEntry -> {
                    personListEntry
                            .setValue(
                                    personListEntry
                                            .getValue()
                                            .stream()
                                            .filter(pet1 -> !pet1.equals(pet))
                                            .toList()
                            );
                });


    }

    //6) вивести на екран зооклуб.
    public void print() {
        System.out.println(this.map);
    }


}
