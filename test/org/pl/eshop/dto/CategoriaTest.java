/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pl.eshop.dto;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertSame;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *  
 * @author admin
 */
public class CategoriaTest {
    
    public CategoriaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void SetId_NegativeNumberAsParam_ExceptionThrown() throws Exception {
        System.out.println("setId");
        Integer id = -1;
        Categoria instance = new Categoria();
        instance.setId(id);        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void SetId_NullNumberAsParam_ExceptionThrown() throws Exception {
        System.out.println("setId");
        Integer id = null;
        Categoria instance = new Categoria();
        instance.setId(id);        
    }

    @Test(expected = IllegalArgumentException.class)
    public void SetNombre_EmptyStringAsParam_ExceptionThrown() throws Exception {
        System.out.println("setNombre");
        String nombre = "";
        Categoria instance = new Categoria();
        instance.setNombre(nombre);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void SetNombre_NullStringAsParam_ExceptionThrown() throws Exception {
        System.out.println("setNombre");
        String nombre = null;
        Categoria instance = new Categoria();
        instance.setNombre(nombre);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SetNombre_StringWithLessThan3LetterAsParam_ExceptionThrown() throws Exception {
        System.out.println("setNombre");
        String nombre = "Al";
        Categoria instance = new Categoria();
        instance.setNombre(nombre);
    }
    
    @Test
    public void GetNombre_NewInstanceOfCategory_EmptyName(){
        System.out.println("getNombre");
        Categoria instance = new Categoria();
        String nombre = instance.getNombre();
        assertSame("", nombre);
    }
}
