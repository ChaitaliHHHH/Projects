package com.anudip.lms.authentication;

import java.util.HashMap;

public final class AdminDetails {
     
        private static final HashMap<String, String> admins = new HashMap<>();

        static 
        {
                admins.put("arnab","arnab345");
                admins.put("trishita","trishita@12");
                admins.put("diya","@diya78");
                admins.put("ankita","ankita245#");
                admins.put("bishal","bishal@8765434");
        }
        static String getPasswordHash(String username) {
                return admins.get(username);
        }
        
        public static boolean hasAdmin(String username) {
                return admins.containsKey(username);
        }

        public static HashMap<String, String> getAdmins() {
                return admins;
        }

}
