package com.leiqjl.spittr.web;

import com.leiqjl.spittr.Spitter;
import com.leiqjl.spittr.data.SpitterRepository;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

public class SpitterControllerTest {

    @Test
    public void shouldShowRegistration() throws Exception {
        SpitterRepository mockRepository = mock(SpitterRepository.class);
        SpitterController spitterController = new SpitterController(mockRepository);
        MockMvc mockMvc = standaloneSetup(spitterController).build();
        mockMvc.perform(get("/spitter/register")).andExpect(view().name("registerForm"));
    }

    @Test
    public void shouldProcessRegistration() throws Exception {
        SpitterRepository mockRepository = mock(SpitterRepository.class);
        Spitter unsaved = new Spitter("jbauer", "24hours", "Jack", "Bauer");
        Spitter saved = new Spitter(24L, "jbauer", "24hours", "Jack", "Bauer");
        when(mockRepository.save(unsaved)).thenReturn(saved);
        SpitterController spitterController = new SpitterController(mockRepository);
        MockMvc mockMvc = standaloneSetup(spitterController).build();
        mockMvc.perform(post("/spitter/register")
                .param("firstName", "Jack")
                .param("lastName","Bauer")
                .param("username","jbauer")
                .param("password","24hours"))
                .andExpect(redirectedUrl("/spitter/jbauer"));
        verify(mockRepository, atLeastOnce()).save(unsaved);
    }
}
