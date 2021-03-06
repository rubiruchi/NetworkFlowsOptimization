/*
 * Copyright (C) 2019 anto
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package NetworkFlowOptimization;

/**
 *
 * @author anto
 * @param <E>
 */
public class CircularQueue<E> {

    private final Object[] t;
    private final int C;
    private int pointer;

    public CircularQueue(int n) {
        this.t = new Object[n];
        this.C = n;
        this.pointer = 0;
    }

    public void store(E n, int d) {
        if (t[d % (C)] == null) {
            t[d % (C)] = new Element<>(n);
        } else {
            @SuppressWarnings("unchecked")
            Element<E> a = (Element<E>) t[d % (C)];
            
            @SuppressWarnings("unchecked")
            Element<E> b = new Element<>(n);
            b.next=a;
            t[d % (C)] = b;
        }
    }

    public E next() {
        
        while (t[pointer] == null) {
            pointer = (pointer + 1) % C;
        }
        @SuppressWarnings("unchecked")
        Element<E> r =(Element<E>) t[pointer];
        if (r.next == null) {
            t[pointer] = null;
        } else {
            @SuppressWarnings("unchecked")
            Element<E> next =(Element<E>)t[pointer];
            next = next.next;
            t[pointer]=next;
        }
        return r.value;
    }
    
    private class Element<E> {

        E value;
        Element<E> next;

        public Element(E value) {
            this.next = null;
            this.value = value;
        }

    }
    

}


