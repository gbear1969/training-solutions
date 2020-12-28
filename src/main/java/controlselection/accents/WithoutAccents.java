package controlselection.accents;

public class WithoutAccents {
    public char convertToCharWithoutAccents(char chr) {

        char c;
        switch (Character.toUpperCase(chr)) {
            case 'Á':
                c = 'a';
                break;

            case 'É':
                c = 'e';
                break;

            case 'Í':
                c = 'i';
                break;

            case 'Ó':
            case 'Ö':
            case 'Ő':
                c = 'o';
                break;

            case 'Ú':
            case 'Ü':
            case 'Ű':
                c = 'u';
                break;

            default:
                c = chr;
        }
        return (Character.isUpperCase(chr) ? Character.toUpperCase(c) : c);
    }
}

