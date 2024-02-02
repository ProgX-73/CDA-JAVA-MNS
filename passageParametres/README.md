 La class Integer est immutable !

	
	Explication:
 Toutes les classes wrapper de primitives (Integer, Byte, Long, Float, Double, Character, Boolean et Short) sont immuables en Java,
 donc les opérations comme l'addition et la soustraction créent un nouvel objet et ne modifient pas l'ancien.
 Lorsqu'on passse ce type d'objet en paramètres à une méthode, le même mécanisme est appliqué.
 Un nouveau wrapper est crée pour la méthode, il sera supprimé lors du retour au code appelant.
 (idem pour les primitives)
 C'est un passage par valeur, la valeur est copier dans une nouvelle variable.

Les autres Objets sont tous passés par Référence.
Lors de l'appel à la méthode, c'est la référence qui est passée, une "sorte de pointeur", "un fil  qui mène à l'objet" et qui est acceuilli par 
la variable déninie dans la déclaration de la fonction.
Ainsi les OBJETS passés par référence sont modifiable depuis le corps de la méthode.
