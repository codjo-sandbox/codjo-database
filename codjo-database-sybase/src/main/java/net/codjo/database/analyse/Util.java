/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package net.codjo.database.analyse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/**
 * Classe utilitaire pour la gestion des strings.
 *
 * @version $Revision: 1.2 $
 */
public final class Util {
    private Util() {
    }


    /**
     * Permet de remplacer une string par une autre dans une string
     *
     * @param str     La string source
     * @param pattern La string � remplacer
     * @param replace La string de remplacement
     *
     * @return La nouvelle string
     */
    public static String replace(String str, String pattern, String replace) {
        int fromIndex = 0;
        int index = str.indexOf(pattern, fromIndex);
        StringBuilder result = new StringBuilder();

        while (index >= 0) {
            result.append(str.substring(fromIndex, index));
            result.append(replace);
            fromIndex = index + pattern.length();
            index = str.indexOf(pattern, fromIndex);
        }

        result.append(str.substring(fromIndex));

        return result.toString();
    }


    /**
     * D�termine si deux objets sont �gaux. Deux objets nuls sont consid�r�s comme �gaux.
     *
     * @param o1 Premier objet
     * @param o2 Second objet
     *
     * @return <code>true</code> si les objets sont �gaux, sinon <code>false</code>.
     */
    public static boolean isEqual(Object o1, Object o2) {
        if (o1 == null && o2 == null) {
            return true;
        }

        if (o1 == null || o2 == null) {
            return false;
        }

        return o1.equals(o2);
    }


    /**
     * Retourne une liste contenant les �l�ments de la collection source qui ne sont pas dans la collection �
     * supprimer.
     *
     * @param srcCollection      Collection source
     * @param collectionToRemove Collection � supprimer
     *
     * @return La liste r�sultat
     */
    public static <T> List<T> removeElements(Collection<T> srcCollection, Collection<T> collectionToRemove) {
        List<T> resultCollection = new ArrayList<T>();
        if (srcCollection != null) {
            resultCollection.addAll(srcCollection);
        }
        resultCollection.removeAll(collectionToRemove);
        return resultCollection;
    }
}
