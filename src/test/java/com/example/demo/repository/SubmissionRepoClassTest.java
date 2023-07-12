package com.example.demo.repository;

import com.example.demo.Controller.SubmissionController;
import com.example.demo.SubmissionDTO;
import com.example.demo.services.SubmissionServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;
public class SubmissionRepoClassTest {

    @Mock
    private SubmissionServiceImpl submissionService;

    @InjectMocks

    private SubmissionController submissionResource;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testPostSubmission() {
        SubmissionDTO inputForm = new SubmissionDTO();
        inputForm.setName("Sanjana Ravula");
        inputForm.setVendorName("Kesh tech");
        inputForm.setRate(100);
        inputForm.setLeadName("Tejan");
        inputForm.setTechnology("Java");

        when(submissionService.postSubmission(inputForm)).thenAnswer(invocation -> {
            SubmissionDTO form = invocation.getArgument(0);
            form.setId("sampleId");
            return form;
        });
        SubmissionDTO resultForm = submissionResource.postSubmission(inputForm);
        assertNotNull(resultForm.getId());
        verify(submissionService, times(1)).postSubmission(inputForm);    }

    @Test
    public void testGetSubmissionFormById() {
        String id = "sampleId";
        SubmissionDTO expectedForm = new SubmissionDTO();
        expectedForm.setId(id);
        expectedForm.setName("Sanjana Ravula");
        expectedForm.setVendorName("Kesh Tech");
        expectedForm.setRate(100);
        expectedForm.setLeadName("Tejan");
        expectedForm.setTechnology("Java");

        when(submissionService.getSubmissionFormById(id)).thenReturn(expectedForm);


        SubmissionDTO resultForm = submissionResource.getSubmissionFormById(id);

        assertNotNull(resultForm.getId());
        verify(submissionService, times(1)).getSubmissionFormById(id);
    }

    @Test
    public void testEditSubmission() {
        SubmissionDTO inputForm = new SubmissionDTO();
        inputForm.setId("sampleId");
        inputForm.setName("Sanjana Ravula");
        inputForm.setVendorName("Kesh Tech");
        inputForm.setRate(100);
        inputForm.setLeadName("Tejan");
        inputForm.setTechnology("Java");

        when(submissionService.editSubmission(inputForm)).thenAnswer(invocation -> {
            SubmissionDTO form = invocation.getArgument(0);
            return form;
        });

        SubmissionDTO resultForm = submissionResource.editSubmission(inputForm);

        assertNotNull(resultForm.getId());
        verify(submissionService, times(1)).editSubmission(inputForm);
    }

    @Test
    public void testDeleteSubmission() {

        String id = "sampleId";
        List<SubmissionDTO> expectedList = Arrays.asList(
                new SubmissionDTO("Sanjana Ravula", "Kesh Tech", 100, "Tejan", "Java"),
                new SubmissionDTO("Roshini Racha", "Cis tech", 85, "Manohar", "devops")
        );
        when(submissionService.deleteSubmission(id)).thenReturn(expectedList);
        List<SubmissionDTO> resultList = submissionResource.deleteSubmission(id);
        assertEquals(expectedList, resultList);
        verify(submissionService, times(1)).deleteSubmission(id);
    }
}