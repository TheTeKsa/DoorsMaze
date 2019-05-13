class Jeux extends Program {
	//variables globales
	boolean finished = false;
	final char[][] nom = new char[][] {{'$', '$', '$', '$', '$', '$', '$', '\\', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '$', '$', '\\', ' ', ' ', ' ', ' ', ' ', ' ', '$', '$', '\\', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, {'$', '$', ' ', ' ', ' ', ' ', '$', '$', '\\', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '$', '$', '$', '\\', ' ', ' ', ' ', ' ', '$', '$', '$', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, {'$', '$', ' ', '|', ' ', ' ', '$', '$', ' ', '|', ' ', '$', '$', '$', '$', '$', '$', '\\', ' ', ' ', ' ', '$', '$', '$', '$', '$', '$', '\\', ' ', ' ', ' ', '$', '$', '$', '$', '$', '$', '\\', ' ', ' ', ' ', '$', '$', '$', '$', '$', '$', '$', '\\', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '$', '$', '$', '$', '\\', ' ', ' ', '$', '$', '$', '$', ' ', '|', ' ', '$', '$', '$', '$', '$',  '$', '\\', ' ', ' ', '$', '$', '$', '$', '$', '$', '$', '$', '\\', ' ', ' ', '$', '$', '$', '$', '$', '$', '\\', ' ', ' '}, {'$', '$', ' ', '|', ' ', ' ', '$', '$', ' ', '|', '$', '$', ' ', ' ', '_', '_', '$', '$', '\\', ' ', '$', '$', ' ', ' ', '_', '_', '$', '$', '\\', ' ', '$', '$', ' ', ' ', '_', '_', '$', '$', '\\', ' ', '$', '$', ' ', ' ', '_', '_', '_', '_', '_', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '$', '$', '\\', '$', '$', '\\', '$', '$', ' ', '$', '$', ' ', '|', ' ', '\\', '_', '_', '_', '_', '$', '$', '\\', ' ', '\\', '_', '_', '_', '_', '$', '$', ' ', ' ', '|', '$', '$', ' ', ' ', '_', '_', '$', '$', '\\', ' '}, {'$', '$', ' ', '|', ' ', ' ', '$', '$', ' ', '|', '$', '$', ' ', '/', ' ', ' ', '$', '$', ' ', '|', '$', '$', ' ', '/', ' ', ' ', '$', '$', ' ', '|', '$', '$', ' ', '|', ' ', ' ', '\\', '_', '_', '|', '\\', '$', '$', '$', '$', '$', '$', '\\', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '$', '$', ' ', '\\', '$', '$', '$', ' ', ' ', '$', '$', ' ', '|', ' ', '$', '$', '$', '$', '$', '$', '$', ' ', '|', ' ', ' ', '$', '$', '$', '$', ' ', '_', '/', ' ', '$', '$', '$', '$', '$', '$', '$', '$', ' ', '|'}, {'$', '$', ' ', '|', ' ', ' ', '$', '$', ' ', '|', '$', '$', ' ', '|', ' ', ' ', '$', '$', ' ', '|', '$', '$', ' ', '|', ' ', ' ', '$', '$', ' ', '|', '$', '$', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '\\', '_', '_', '_', '_', '$', '$', '\\', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '$', '$', ' ', '|', '\\', '$', ' ', ' ', '/', '$', '$', ' ', '|', '$', '$', ' ', ' ', '_', '_', '$', '$', ' ', '|', ' ', '$', '$', ' ', ' ', '_', '/', ' ', ' ', ' ', '$', '$', ' ', ' ', ' ', '_', '_', '_', '_', '|'}, {'$', '$', '$', '$', '$', '$', '$', ' ', ' ', '|', '\\', '$', '$', '$', '$', '$', '$', ' ', ' ', '|', '\\', '$', '$', '$', '$', '$', '$', ' ', ' ', '|', '$', '$', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', '$', '$', '$', '$', '$', '$', '$', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '$', '$', ' ', '|', ' ', '\\', '_', '/', ' ', '$', '$', ' ', '|', '\\', '$', '$', '$', '$', '$', '$', '$', ' ', '|', '$', '$', '$', '$', '$', '$', '$', '$', '\\', ' ', '\\', '$', '$', '$', '$', '$', '$', '$', '\\', ' '}, {'\\', '_', '_', '_', '_', '_', '_', '_', '/', ' ', ' ', '\\', '_', '_', '_', '_', '_', '_', '/', ' ', ' ', '\\', '_', '_', '_', '_', '_', '_', '/', ' ', '\\', '_', '_', '|', ' ', ' ', ' ', ' ', ' ', ' ', '\\', '_', '_', '_', '_', '_', '_', '_', '/', ' ', '$', '$', '$', '$', '$', '$', '\\', ' ', '\\', '_', '_', '|', ' ', ' ', ' ', ' ', ' ', '\\', '_', '_', '|', ' ', '\\', '_', '_', '_', '_', '_', '_', '_', '|', '\\', '_', '_', '_', '_', '_', '_', '_', '_', '|', ' ', '\\', '_', '_', '_', '_', '_', '_', '_', '|'}, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '\\', '_', '_', '_', '_', '_', '_', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

	//fonctions de test
	void testEstChiffre() {
		assertTrue(estChiffre('5'));
		assertTrue(estChiffre('0'));
		assertTrue(estChiffre('9'));
		assertFalse(estChiffre('a'));
		assertFalse(estChiffre(' '));
	}

	void testChoixValide() {
		assertTrue(choixValide("1", 1, 3));
		assertTrue(choixValide("2", 1, 4));
		assertFalse(choixValide("13", 1, 3));
		assertFalse(choixValide(" ", 0, 9));
		assertFalse(choixValide("6", 1, 3));
	}

	void testEstBonneReponse() {
		String[][] questionsString = loadCsv("ressources/Questions.txt", ';');
		Question[] q = stringToQuestion(questionsString);

		assertTrue(estBonneReponse(q, 2, 1));
		assertFalse(estBonneReponse(q, 7, 2));
	}

	//fonctions d'initialisation
	Question[] initialiserTableauQuestion(int taille) {
		Question[] result = new Question[taille];

		for (int i = 0; i < length(result); i ++) {
			result[i] = new Question();
		}
		return result;
	}

	Joueur[] initialiserTableauJoueur(int taille) {
		Joueur[] result = new Joueur[taille];

		for (int i = 0; i < length(result); i ++) {
			result[i] = new Joueur();
		}
		return result;
	}

	boolean[] initialiserTableauBoolean(int taille) {
		boolean[] result = new boolean[taille];
		for (int i = 0; i < length(result); i ++) {
			result[i] = true;
		}
		return result;
	}

	//fonctions qui renvoie un boolean
	boolean estChiffre(char car) {
		boolean result = true;

		if (car < '0' || car > '9') {
			result = false;
		}
		return result;
	}

	boolean choixValide(String chaine, int min, int max) {
		char c = ' ';

		if (length(chaine) != 0) {
			c = charAt(chaine, 0);
		}
		if (length(chaine) != 1 || !estChiffre(c) || c < min + 48 || c > max + 48) {
			return false;
		}
		return true;
	}

	boolean estBonneReponse(Question[] tab, int rdm, int choix) {
		if (tab[rdm].bonneReponse == choix) {
			return true;
		}
		return false;
	}

	boolean actualiserQuestions(boolean[] tab) {
		boolean result = true;
		for (int i = 0; i < length(tab); i ++) {
			if (tab[i]) {
				result = false;
			}
		}
		return result;
	}

	//fonctions qui renvoie un int
	int saisiReponse() {
		String result = " ";

		while (!choixValide(result, 1, 3)) {
			cursor(40, 110);
			clearEOL();
			print("Choix (numero porte) : ");
			result = readString();
		}
		return stringToInt(result);
	}

	int alea(boolean[] tab, int max) {
		int rdm = (int) (random() * max);

		while (!tab[rdm]) {
			rdm = (int) (random() * max);
		}
		return rdm;
	}

	//fonctions qui renvoie un string
	String[][] loadCsv(String file, char separateur) {
		String[][] result = new String[rowCount(loadCSV(file, separateur))][columnCount(loadCSV(file, separateur))];
		for (int i = 0; i < length(result, 2); i ++) {
			for (int j = 0; j < length(result, 1); j ++) {
				result[j][i] = getCell(loadCSV(file, separateur), j, i); 
			}
		}
		return result;
	}

	String[][] joueurToString(Joueur[] tab) {
		String[][] result = new String[length(tab)][2];

		for (int i = 0; i < length(tab); i ++) {
			result[i][0] = tab[i].pseudo;
			result[i][1] = tab[i].score + "";
		}
		return result;
	}

	//fonction qui renvoie un question
	Question[] stringToQuestion(String[][] tab) {
		Question[] result = initialiserTableauQuestion(length(tab, 1));

		for (int i = 0; i < length(result); i ++) {
			result[i].question = tab[i][0];
			result[i].reponse1 = tab[i][1];
			result[i].reponse2 = tab[i][2];
			result[i].reponse3 = tab[i][3];
			result[i].bonneReponse = stringToInt(tab[i][4]);
		}
		return result;
	}

	//fonction qui renvoie un joueur
	Joueur[] stringToJoueur(String[][] tab) {
		Joueur[] result = initialiserTableauJoueur(length(tab, 1));

		for (int i = 0; i < length(result); i ++) {
			result[i].pseudo = tab[i][0];
			result[i].score = stringToInt(tab[i][1]);
			result[i].vie = 0;
		}
		return result;
	}

	Joueur[] majClassement(Joueur[] tab, String pseudo, int score) {
		String tmpPseudo = "";
		int tmpScore = 0;
		for (int i = 0; i < length(tab); i ++) {
			if (score > tab[i].score) {
				tmpPseudo = tab[i].pseudo;
				tmpScore = tab[i].score;
				tab[i].pseudo = pseudo;
				tab[i].score = score;
				pseudo = tmpPseudo;
				score = tmpScore;
			}
		}
		return tab;
	}

	//fonctions sans retour
	void attendToucheEntree() {
		String nul = readString();
	}

	void menu() {
		String choix = "";
		String[][] joueurString = loadCsv("ressources/Joueur.txt", ';');
		Joueur[] joueurs = stringToJoueur(joueurString);

		do {
			cursor(38, 124);
			clearEOL();
			choix = readString();
		} while(!choixValide(choix, 1, 3));
		if (stringToInt(choix) == 1) {
			afficherDifficulte();
		} else if (stringToInt(choix) == 2) {
			afficherClassement(joueurs);
		} else {
			quitter();
		}
	}

	void difficulte() {
		String choix = "";
		int nb = 0;

		do {
			cursor(38, 124);
			clearEOL();
			choix = readString();
		} while (!choixValide(choix, 1, 4));
		nb = stringToInt(choix);
		if (nb == 4) {
			afficherMenu();
		} else {
			game(nb);
		}
	}

	void quitter() {
		clearScreen();
		cursor(23, 110);
		print("MERCI D'AVOIR JOUE !");
		cursor(35, 95);
		print("Réalisé par : Caroline Sauvage et Aymeric Defossez");
		cursor(40, 110);
		print("Appuyez sur entrée");
		attendToucheEntree();
		clearScreen();
		cursor(1, 1);
		show();
		System.exit(1);
	}

	//fonctions d'affichage
	void affichageGameOver(int score) {
		String[] gameOver = new String[] {" $$$$$$\\                                           $$$$$$\\                                 ", "$$  __$$\\                                         $$  __$$\\                                ", "$$ /  \\__| $$$$$$\\  $$$$$$\\$$$$\\   $$$$$$\\        $$ /  $$ |$$\\    $$\\  $$$$$$\\   $$$$$$\\  ", "$$ |$$$$\\  \\____$$\\ $$  _$$  _$$\\ $$  __$$\\       $$ |  $$ |\\$$\\  $$  |$$  __$$\\ $$  __$$\\ ", "$$ |\\_$$ | $$$$$$$ |$$ / $$ / $$ |$$$$$$$$ |      $$ |  $$ | \\$$\\$$  / $$$$$$$$ |$$ |  \\__|", "$$ |  $$ |$$  __$$ |$$ | $$ | $$ |$$   ____|      $$ |  $$ |  \\$$$  /  $$   ____|$$ |      ", "\\$$$$$$  |\\$$$$$$$ |$$ | $$ | $$ |\\$$$$$$$\\        $$$$$$  |   \\$  /   \\$$$$$$$\\ $$ |      ", " \\______/  \\_______|\\__| \\__| \\__| \\_______|$$$$$$\\\\______/     \\_/     \\_______|\\__|      ", "                                           \\______|                                        "};

		clearScreen();
		hide();
		afficherTableau(gameOver, 0, 12, 70, 1);
		cursor(32, 110);
		print("Votre score : " + score);
		cursor(40, 109);
		print("Appuyez sur entrée.");
		attendToucheEntree();
		afficherMenu();
	}

	void afficherTableau(char[][] tab, int delai, int posX, int posY, int nbRep) {
		for (int i = 0; i < nbRep; i ++) {
			for (int j = 0; j < length(tab, 1); j ++) {
				for (int k = 0; k < length(tab, 2); k ++) {
					if (tab[j][k] != ' ') {
						delay(delai);
						cursor(j + posX, k + posY);
						print(tab[j][k]);
					}
				}
			}
			posY += length(tab, 2) + 2;
		}
	}

	void afficherTableau(String[] tab, int delai, int posX, int posY, int nbRep) {
		for (int i = 0; i < nbRep; i ++) {
			for (int j = 0; j < length(tab); j ++) {
				delay(delai);
				cursor(j + posX, i + posY);
				print(tab[j]);
			}
			posY += length(tab) + 2;
		}
	}

	void afficherTableau(String[][] tab, int delai, int posX, int posY) {
		for (int i = 0; i < length(tab, 1); i ++) {
			for (int j = 0; j < length(tab, 2); j ++) {
				cursor(posX + j, posY);
				print(tab[i][j]);
			}
			delay(delai);
		}
	}

	void afficherNumeroPorte() {
		hide();
		cursor(31, 103);
		print('1');
		cursor(31, 121);
		print('2');
		cursor(31, 139);
		print('3');
		show();
	}

	void afficherNom() {
		clearScreen();
		hide();
		afficherTableau(nom, 10, 23, 65, 1);
		cursor(40, 109);
		print("Appuyez sur entrée.");
		attendToucheEntree();
		show();
		afficherMenu();
	}

	void afficherMenu() {
		clearScreen();
		hide();
		afficherTableau(nom, 0, 12, 65, 1);
		cursor(30, 110);
		print("1. Jouer");
		cursor(31, 110);
		print("2. Classement");
		cursor(32, 110);
		print("3. Quitter");
		cursor(38, 110);
		print("Votre choix : ");
		show();
		menu();
	}

	void afficherClassement(Joueur[] tab) {
		String[] nomClassement = new String[] {" $$$$$$\\  $$\\                                                                            $$\\     ", "$$  __$$\\ $$ |                                                                           $$ |    ", "$$ /  \\__|$$ | $$$$$$\\   $$$$$$$\\  $$$$$$$\\  $$$$$$\\  $$$$$$\\$$$$\\   $$$$$$\\  $$$$$$$\\ $$$$$$\\   ", "$$ |      $$ | \\____$$\\ $$  _____|$$  _____|$$  __$$\\ $$  _$$  _$$\\ $$  __$$\\ $$  __$$\\\\_$$  _|  ", "$$ |      $$ | $$$$$$$ |\\$$$$$$\\  \\$$$$$$\\  $$$$$$$$ |$$ / $$ / $$ |$$$$$$$$ |$$ |  $$ | $$ |    ", "$$ |  $$\\ $$ |$$  __$$ | \\____$$\\  \\____$$\\ $$   ____|$$ | $$ | $$ |$$   ____|$$ |  $$ | $$ |$$\\ ", "\\$$$$$$  |$$ |\\$$$$$$$ |$$$$$$$  |$$$$$$$  |\\$$$$$$$\\ $$ | $$ | $$ |\\$$$$$$$\\ $$ |  $$ | \\$$$$  |", " \\______/ \\__| \\_______|\\_______/ \\_______/  \\_______|\\__| \\__| \\__| \\_______|\\__|  \\__|  \\____/ "};
		
		clearScreen();
		hide();
		afficherTableau(nomClassement, 0, 12, 70, 1);
		for (int i = 0; i < 5; i ++) {
			cursor(i + 30, 112);
			print(i + 1 + ". " + tab[i].pseudo + " : " + tab[i].score);
		}
		cursor(40, 109);
		print("Appuyez sur entrée.");
		attendToucheEntree();
		show();
		afficherMenu();
	}

	void afficherDifficulte() {
		clearScreen();
		hide();
		afficherTableau(nom, 0, 12, 65, 1);
		cursor(30, 110);
		print("1. Facile");
		cursor(31, 110);
		print("2. Normal");
		cursor(32, 110);
		print("3. Difficile");
		cursor(34, 110);
		print("4. Retour");
		cursor(38, 110);
		print("Votre choix : ");
		show();
		difficulte();
	}

	void afficherQuestion(Question[] tab, int rdm) {
		cursor(15, 121 - (length(tab[rdm].question) / 2));
		print(tab[rdm].question);
	}

	void afficherReponses(Question[] tab, int rdm) {
		cursor(21, 95);
		print(tab[rdm].reponse1);
		cursor(21, 113);
		print(tab[rdm].reponse2);
		cursor(21, 131);
		print(tab[rdm].reponse3);
	}

	//fonctions moteur du jeu
	void algorithm() {
		afficherNom();
		afficherMenu();
	}

	void game(int difficulte) {
		char[][] coeur = new char[][] {{' ', '.', ':', ':', ':', '.', ' ', ' ', ' ', '.', ':', ':', ':', '.', ' '}, {':', ':', ':', ':', ':', ':', ':', '.', ':', ':', ':', ':', ':', ':', ':'}, {':', ':', ':', ':', ':', ':', ':', ':', ':', ':', ':', ':', ':', ':', ':'}, {'\'', ':', ':', ':', ':', ':', ':', ':', ':', ':', ':', ':', ':', ':', '\''}, {' ', ' ', '\'', ':', ':', ':', ':', ':', ':', ':', ':', ':', '\'', ' ', ' '}, {' ', ' ', ' ', ' ', '\'', ':', ':', ':', ':', ':', '\'', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', '\'', ':', '\'', ' ', ' ', ' ', ' ', ' ', ' '}};
		String[][] questionsString = loadCsv("ressources/Questions.txt", ';');
		String[][] bonnePorte = new String[][] {{" _______________ ", "|\\ ___________ /|", "| |  /|,| |   | |", "| | |,x,| |   | |", "| | |,x,' |   | |", "| | |,x   ,   | |", "| | |/    |   | |", "| |    /] ,   | |", "| |   [/ ()   | |", "| |       |   | |", "| |       |   | |", "| |       |   | |", "| |      ,'   | |", "| |   ,'      | |", "|_|,'_________|_|"}, {" _______________ ", "|\\ ___________ /|", "| |           | |", "| |           | |", "| |           | |", "| |           | |", "| |       /   | |", "| |    \\ /    | |", "| |     v     | |", "| |           | |", "| |           | |", "| |           | |", "| |           | |", "| |           | |", "|_|___________|_|"}};
		String[][] mauvaisePorte = new String[][] {{" _______________ ", "|\\ ___________ /|", "| |  /|,| |   | |", "| | |,x,| |   | |", "| | |,x,' |   | |", "| | |,x   ,   | |", "| | |/    |   | |", "| |    /] ,   | |", "| |   [/ ()   | |", "| |       |   | |", "| |       |   | |", "| |       |   | |", "| |      ,'   | |", "| |   ,'      | |", "|_|,'_________|_|"}, {" _______________ ", "|\\ ___________ /|", "| |           | |", "| |           | |", "| |           | |", "| |           | |", "| |    \\ /    | |", "| |     X     | |", "| |    / \\    | |", "| |           | |", "| |           | |", "| |           | |", "| |           | |", "| |           | |", "|_|___________|_|"}};
		String[][] joueurString = loadCsv("ressources/Joueur.txt", ';');
		Joueur[] joueurs = stringToJoueur(joueurString);
		String[] porte = new String[] {" _______________ ", "|\\ ___________ /|", "| |  _ _ _ _  | |", "| | | | | | | | |", "| | |-+-+-+-| | |", "| | |-+-+-+-| | |", "| | |_|_|_|_| | |", "| |           | |", "| |           | |", "| |   [   ] ()| |", "| |         ||| |", "| |         ()| |", "| |           | |", "| |           | |", "|_|___________|_|"};
		Question[] questions = stringToQuestion(questionsString);
		boolean[] peutSortirQuestion = initialiserTableauBoolean(length(questions));
		int choix = 0, rdm = alea(peutSortirQuestion, length(questions));
		Joueur p1 = new Joueur();
		boolean plusDeQuestion = false;

		p1.vie = 6 - (difficulte * 2 - 1);
		clearScreen();
		cursor(30, 110);
		print("Votre pseudo : ");
		p1.pseudo = readString();
		while (p1.vie > 0 && !plusDeQuestion) {
			clearScreen();
			afficherTableau(coeur, 0, 2, 2, p1.vie);
			afficherTableau(porte, 0, 22, 95, 3);
			afficherNumeroPorte();
			afficherQuestion(questions, rdm);
			afficherReponses(questions, rdm);
			show();
			choix = saisiReponse();
			hide();
			if (estBonneReponse(questions, rdm, choix)) {
				afficherTableau(bonnePorte, 500, 22, 95 + 18 * (choix - 1));
				p1.score += difficulte;
			} else {
				afficherTableau(mauvaisePorte, 500, 22, 95 + 18 * (choix - 1));
				p1.vie --;
			}
			peutSortirQuestion[rdm] = false;
			plusDeQuestion = actualiserQuestions(peutSortirQuestion);
			if (!plusDeQuestion) {
				rdm = alea(peutSortirQuestion, length(questions));
			}
			delay(1000);
		}
		joueurs = majClassement(joueurs, p1.pseudo, p1.score);
		joueurString = joueurToString(joueurs);
		saveCSV(joueurString, "ressources/Joueur.txt", ';');
		affichageGameOver(p1.score);
	}
}