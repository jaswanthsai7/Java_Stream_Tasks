/*
 * Author Name : Jaswanth Sai
 * Date : 9/14/2022
 * Created With: INTELLIJ IDEA COMMUNITY EDITION
 */
package com.github.jaswanth.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PortalCredentialsCreator {
    public List<UserName> createListOfUserNames(List<Student> studentsList) {
        List<UserName> userNames = new ArrayList<>();
        Iterator<Student> iterator = studentsList.iterator();
        while (iterator.hasNext()) {
            if (!userNames.contains(iterator.next().getFirstName()))
                userNames.add(new UserName(iterator.next().getFirstName()));
        }
        return userNames;
    }

    public List<PassWord> createListOfRandomPassWord(List<Student> studentList) {
        return null;
    }
}
