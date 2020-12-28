package controlselection.consonant;

public class ToConsonant {
    public char convertToConsonant(char chr) {

        switch (Character.toUpperCase(chr)) {
            case 'A':
            case 'Á':
                return 'b';

            case 'E':
            case 'É':
                return 'f';

            case 'I':
            case 'Í':
                return 'j';

            case 'O':
            case 'Ó':
            case 'Ö':
            case 'Ő':
                return 'p';

            case 'U':
            case 'Ú':
            case 'Ü':
            case 'Ű':
                return 'v';

            default:
                return chr;
        }
    }
}
