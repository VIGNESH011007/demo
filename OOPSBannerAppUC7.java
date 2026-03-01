public class OOPSBannerAppUC7 {
   static class CharacterPatternMap {
        Character character;
        String[] pattern;
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        public Character getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
        public static CharacterPatternMap[] createCharacterPatternMaps() {
            return new CharacterPatternMap[] {
                new CharacterPatternMap('O', new String[] {
                    "   ***   ",
                    " **   ** ",
                    "**     **",
                    "**     **",
                    "**     **",
                    " **   ** ",
                    "   ***   "
                }),
                new CharacterPatternMap('P', new String[] {
                    "******  ",
                    "**   ** ",
                    "**   ** ",
                    "******  ",
                    "**      ",
                    "**      ",
                    "**      "
                }),
                new CharacterPatternMap('S', new String[] {
                    "  *****  ",
                    " **   ** ",
                    "**       ",
                    "  *****  ",
                    "       **",
                    " **   ** ",
                    "  *****  "
                })
            };
        }
        public static String[] getCharacterPattern(Character character, CharacterPatternMap[] characterPatternMaps) {
            for (CharacterPatternMap map : characterPatternMaps) {
                if (map.getCharacter().equals(character)) {
                    return map.getPattern();
                }
            }
            return new String[0];
        }
        public static void printMessage(String message, CharacterPatternMap[] characterPatternMaps) {
            String[] outputLines = new String[7];
            for (int i = 0; i < 7; i++) {
                outputLines[i] = "";
            }
            for (char c : message.toCharArray()) {
                String[] pattern = getCharacterPattern(c, characterPatternMaps);
                for (int i = 0; i < 7; i++) {
                    outputLines[i] += pattern[i] + " ";
                }
            }
            for (String line : outputLines) {
                System.out.println(line);
            }
        }
        public static void main(String[] args) {
            CharacterPatternMap[] characterPatternMaps = createCharacterPatternMaps();
            String message = "OOPS";
            printMessage(message, characterPatternMaps);
        }
   }

}    