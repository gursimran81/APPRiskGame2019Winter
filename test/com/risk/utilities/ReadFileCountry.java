package com.risk.utilities;

import com.risk.model.GameMapModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class ReadFileCountry {
    private static final boolean False = false;
    GameMapModel gameMapModel;
    Validation val;
    ReadFile readFile;
    File file;

    private static boolean setUpIsDone = false;

    /**
     * Set up variables
     */
    @Before
    public void setUp() {
        if (setUpIsDone) {
            return;
        }
        this.readFile = new ReadFile();
        file = new File(Constant.filePath.toUri());
        this.readFile.setFile(file);
        val = new Validation();
        gameMapModel = new GameMapModel(file);
        setUpIsDone = true;
    }

    /**
     * Test read file get country
     */
    @Test
    public void testReadFileGetCountry() {
        Assert.assertEquals(true,readFile.validateReadCountry(gameMapModel.getCountries(), readFile.getMapCountryDetails()));
    }

}
