package generators;

import model.ContactData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class ContactDataGenerator {
    public static void main(String[]args)throws IOException {
        int count = Integer.parseInt(args[0]);
        File file = new File(args[1]);
        List<ContactData> contacts = generateContacs(count);
        save(contacts,file);
    }

    private static void save(List<ContactData> contacts, File file) throws IOException {
        Writer writer = new FileWriter(file);
        for (ContactData contact:contacts){
            writer.write(String.format("%s;%s;%s;%s;%s;%s\n",
                    contact.getFirstname(),
                    contact.getLastname(),
                    contact.getNickname(),
                    contact.getCompany(),
                    contact.getAddress(),
                    contact.getHome()));
        }
        writer.close();
    }

    private static List<ContactData> generateContacs(int count) {
        List<ContactData> contacts = new ArrayList<>();
        for(int i=0; i<count; i++){
            contacts.add(new ContactData()
                    .wihtFirstname(String.format("firstname %s",i))
                    .wihtLastname(String.format("lastname %s",i))
                    .wihtNickname(String.format("nickname %s",i))
                    .wihtCompany(String.format("company %s",i))
                    .wihtAddress(String.format("address %s",i))
                    .wihtHome(String.format("Home %s",i)));
        }
        return contacts;
    }

}
