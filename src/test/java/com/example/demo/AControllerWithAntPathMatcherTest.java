package com.example.demo;

import org.springframework.test.context.TestPropertySource;

@TestPropertySource(properties = {"spring.mvc.pathmatch.matching-strategy=ant_path_matcher"})
class AControllerWithAntPathMatcherTest extends AControllerTestBase {
}
