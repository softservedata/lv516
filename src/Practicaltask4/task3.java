package Practicaltask4;
import java.util.Scanner;
public class task3 {
    public enum continent{
        AFRICA,ASIA,EUROPE,NORTHAMERIKA,SOUTHAMERIKA,OCEANIA
    }
    public static void main(String[] args) {
        String country;
        Scanner sc = new Scanner(System.in);
        String[] arrAfrika = {"Algeria", "Angola", "Benin", "Botswana", "Burkina", "Burundi", "Cameroon", "Cape Verde", "Central African Republic", "Chad", "Comoros", "Congo", "Congo Democratic Republic of", "Djibouti", "Egypt", "Equatorial Guinea", "Eritrea", "Ethiopia", "Gabon", "Gambia", "Ghana", "Guinea", "Guinea-Bissau", "Ivory Coast", "Kenya", "Lesotho", "Liberia", "Libya", "Madagascar", "Malawi", "Mali", "Mauritania", "Mauritius", "Morocco", "Mozambique", "Namibia", "Niger", "Nigeria", "Rwanda", "Sao Tome and Principe", "Senegal", "Seychelles ", "Sierra Leone", " Somalia", "South Africa", " South Sudan", " Sudan", " Swaziland", " Tanzania", " Togo", " Tunisia", " Uganda", " Zambia", " Zimbabwe"};
        String[] arrEurope = {"Albania", "Andorra", "Armenia", "Austria", "Azerbaijan", "Belarus", "Belgium", "Bosnia and Herzegovina", "Bulgaria", "Croatia", "Cyprus", "Czech Republic", "Denmark", "Estonia", "Finland", "France", "Georgia", "Germany", "Greece", "Hungary", "Iceland", "Ireland", "Italy", "Latvia", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Malta", "Moldova", "Monaco", "Montenegro", "Netherlands", "Norway", "Poland", "Portugal", "Romania", "San Marino", "Serbia", "Slovakia", "Slovenia", "Spain", "Sweden", "Switzerland", "Ukraine", "United Kingdom", "Vatican City"};
        String[] arrAsia = {"Afghanistan", "Bahrain", "Bangladesh", "Bhutan", "Brunei", "Burma (Myanmar)", "Cambodia", "China", "East Timor", "India", "Indonesia", "Iran", "Iraq", "Israel", "Japan", "Jordan", "Kazakhstan", "Korea North", "Korea South", "Kuwait", "Kyrgyzstan", "Laos", "Lebanon", "Malaysia", "Maldives", "Mongolia", "Nepal", "Oman", "Pakistan", "Philippines", "Qatar", "Russian Federation", "Saudi Arabia", "Singapore", "Sri Lanka", "Syria", "Tajikistan", "Thailand", "Turkey", "Turkmenistan", "United Arab Emirates", "Uzbekistan", "Vietnam", "Yemen"};
        String[] arrNAmerika = {"Antigua and Barbuda", "Bahamas", "Barbados", "Belize", "Canada", "Costa Rica", "Cuba", "Dominica", "Dominican Republic", "El Salvador", "Grenada", "Guatemala", "Haiti", "Honduras", "Jamaica", "Mexico", "Nicaragua", "Panama", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Trinidad and Tobago", "United States"};
        String[] arrSAmerika = {"Argentina", "Bolivia", "Brazil", "Chile", "Colombia", "Ecuador", "Guyana", "Paraguay", "Peru", "Suriname", "Uruguay", "Venezuela"};
        String[] arrOceania = {"Australia", "Fiji", "Kiribati", "Marshall Islands", "Micronesia", "Nauru", "New Zealand", "Palau", "Papua New Guinea", "Samoa", "Solomon Islands", "Tonga", "Tuvalu", "Vanuatu"};
        System.out.println("Input country");
        country = sc.nextLine();
        for (int i = 0; i < arrAfrika.length; i++) {
            if (country.equalsIgnoreCase(arrAfrika[i])) {
                System.out.println("It is country by" + continent.AFRICA);
            }
        }
        for (int i = 0; i < arrEurope.length; i++) {
            if (country.equalsIgnoreCase(arrEurope[i])) {
                System.out.println("It is country by " + continent.EUROPE);

            }
        }
        for (int i = 0; i < arrAsia.length; i++) {
            if (country.equalsIgnoreCase(arrAsia[i])) {
                System.out.println("It is country by " + continent.ASIA);
            }
        }
        for (int i = 0; i < arrNAmerika.length; i++) {
            if (country.equalsIgnoreCase(arrNAmerika[i])) {
                System.out.println("It is country by " + continent.NORTHAMERIKA);
            }
        }
        for (int i = 0; i < arrSAmerika.length; i++) {
            if (country.equalsIgnoreCase(arrSAmerika[i])) {
                System.out.println("It is country by " + continent.SOUTHAMERIKA);
    }
}
        for (int i = 0; i < arrOceania.length; i++) {
            if (country.equalsIgnoreCase(arrOceania[i])) {
                System.out.println("It is country by " + continent.OCEANIA);
    }
}
    }
}