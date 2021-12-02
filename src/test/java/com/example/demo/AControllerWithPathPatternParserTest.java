package com.example.demo;

import org.springframework.test.context.TestPropertySource;

@TestPropertySource(properties = {"spring.mvc.pathmatch.matching-strategy=path_pattern_parser"})
class AControllerWithPathPatternParserTest extends AControllerTestBase {

}
