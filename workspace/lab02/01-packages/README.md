# Laboratorio 02

## Esecuzione da posizioni arbitrarie

1. Si osservi il contenuto della cartella `src`. Si noti come non contenga sorgenti Java ma una gerarchia di cartelle, all'interno dell'ultima cartella è presente il file sorgente.
2. Si apra il file sorgente e si noti come il package della classe corrisponda alla struttura delle directory che contengono il file sorgente
  - *Nota*: è buona norma organizzare i sorgenti in modo che la loro struttura sul file system replichi la struttura dei package. Si noti però che, lavorando il compilatore su *file*, tale scelta non è strettamente obbligatoria
3. Si posizioni il terminale in modo che punti alla cartella che contiene `src`
4. Si esegua la compilazione del file `ComplexNum.java` all'interno di una nuova cartella bin
5. Si faccia una previsione circa il contenuto di bin (in termini di quali cartelle e quali file vi saranno all'interno)
6. Si verifichi la propria previsione, e ci si prepari a dire al docente, in fase di correzione, se la previsione è stata corretta (e se si è compreso perché non lo è stata, in caso).
7. Si esegua la classe usando il comando: `java -cp bin ComplexNum`
  - Oh-oh... errore. Perché? Si provi a comprenderne la ragione
8. Si punti il terminale in `bin/oop/lab02/math/`
9. Si provi a compilare usando il comando: `java -cp bin ComplexNum`
  - Oh-oh... errore. Perché? Eppure il file `ComplexNum.class` è proprio lì. Si provi a comprenderne la ragione.
10. Si posizioni il terminale nella cartella contenente `src` e `bin`
11. Si esegua il programma ComplexNum utilizzando il comando corretto.
12. Si risponda alla seguente domanda: spostando il file `ComplexNum.class` in una diversa cartella, come sarebbe possibile eseguire (se è possibile)? Si fornisca la risposta al docente.