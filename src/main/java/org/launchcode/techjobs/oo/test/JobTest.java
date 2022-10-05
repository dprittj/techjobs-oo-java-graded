package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job aJob = new Job();
        Job bJob = new Job();

        assertNotEquals(aJob.getId(), bJob.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(newJob instanceof Job);
        assertTrue(newJob.getEmployer() instanceof Employer);
        assertTrue(newJob.getLocation() instanceof Location);
        assertTrue(newJob.getPositionType() instanceof PositionType);
        assertTrue(newJob.getCoreCompetency() instanceof CoreCompetency);

        assertEquals(newJob.getName(), "Product tester");
        assertEquals(newJob.getEmployer().toString(), "ACME");
        assertEquals(newJob.getLocation().toString(), "Desert");
        assertEquals(newJob.getPositionType().toString(), "Quality control");
        assertEquals(newJob.getCoreCompetency().toString(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job aJob = new Job("Product tester", new Employer ("ACME"), new Location ("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Job bJob = new Job("Product tester", new Employer ("ACME"), new Location ("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(aJob.equals(bJob));
        assertFalse(bJob.equals(aJob));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job newJob = new Job("Product tester", new Employer ("ACME"), new Location ("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String jobObject = newJob.toString();

        assertEquals(jobObject.charAt(0), '\n');
        assertEquals(jobObject.charAt(jobObject.length()-1), '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job newJob = new Job("Product tester", new Employer ("ACME"), new Location ("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(newJob.toString(),
                "\nID: " + newJob.getId() + "\nName: " + newJob.getName() + "\nEmployer: " + newJob.getEmployer() + "\nLocation: " + newJob.getLocation() + "\nPosition Type: " + newJob.getPositionType() + "\nCore Competency: " + newJob.getCoreCompetency() + "\n");
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job newJob = new Job("", new Employer(""), new Location (""), new PositionType(""), new CoreCompetency(""));

        System.out.println(newJob.toString());

        assertTrue(newJob.toString().contains("Name: Data not available"));
        assertTrue(newJob.toString().contains("Employer: Data not available"));
        assertTrue(newJob.toString().contains("Location: Data not available"));
        assertTrue(newJob.toString().contains("Position Type: Data not available"));
        assertTrue(newJob.toString().contains("Core Competency: Data not available"));
        assertEquals(newJob.toString(),
                "\nID: " + newJob.getId() +
                        "\nName: Data not available" +
                        "\nEmployer: Data not available" +
                        "\nLocation: Data not available" +
                        "\nPosition Type: Data not available"  +
                        "\nCore Competency: Data not available"  + "\n");

    }
}
