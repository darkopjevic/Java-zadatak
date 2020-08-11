#include<stdio.h>

char mat[4][3] = { {'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','#'} };
char finalniNiz[6];
void skoci(int i, int j, int duzina);
void ispisiFinalniNiz();

void main() {
	char broj, i, j;
	printf("Unesite broj: ");
	scanf("%c", &broj);

	//Pocetna pozicija
	switch (broj)
	{
		case '1':
			i = 0; j = 0;
			break;
		case '2':
			i = 0; j = 1;
			break;
		case '3':
			i = 0; j = 2;
			break;
		case '4':
			i = 1; j = 0;
			break;
		case '5':
			i = 1; j = 1;
			break;
		case '6':
			i = 1; j = 2;
			break;
		case '7':
			i = 2; j = 0;
			break;
		case '8':
			i = 2; j = 1;
			break;
		case '9':
			i = 2; j = 2;
			break;
		case '*':
			i = 3; j = 0;
			break;
		case '0':
			i = 3; j = 1;
			break;
		case '#':
			i = 3; j = 2;
			break;
	}

	printf("\n\n");

	skoci(i, j, 6);
	system("pause");
}

void skoci(int i, int j, int duzina) {
	if (mat[i][j] != '*' && mat[i][j] != '#')
	{
		finalniNiz[6 - duzina] = mat[i][j];
		duzina--;
	}

	if (duzina == 0) {
		ispisiFinalniNiz();
		return;
	}

	//Ima ukupno 8 skokova

	//Gore lijevo
	if (i - 2 >= 0 && j - 1 >= 0)
		skoci(i - 2, j - 1, duzina);

	//Gore desno
	if (i - 2 >= 0 && j + 1 <= 2)
		skoci(i - 2, j + 1, duzina);

	//Dole lijevo
	if (i + 2 <= 3 && j - 1 >= 0)
		skoci(i + 2, j - 1, duzina);

	//Dole desno
	if (i + 2 <= 3 && j + 1 <= 2)
		skoci(i + 2, j + 1, duzina);

	//Lijevo gore
	if (j - 2 >= 0 && i-1>=0)
		skoci(i - 1, j - 2, duzina);

	//Lijevo dole
	if (j - 2 >= 0 && i + 1 <= 3)
		skoci(i + 1, j - 2, duzina);

	//Desno gore
	if (j + 2 <=2 && i - 1 >= 0)
		skoci(i - 1, j + 2, duzina);

	//Desno dole
	if (j + 2 <= 2 && i + 1 <=3)
		skoci(i + 1, j + 2, duzina);
}

void ispisiFinalniNiz()
{
	int i;
	for (i = 0; i < 6; i++)
		printf("%c", finalniNiz[i]);
	printf("\n");
}