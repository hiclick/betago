<?php

/**
 * http://www.w3school.com.cn/php/php_syntax.asp
 * http://php.net/manual/zh/function.require.php
 * http://php.net/manual/zh/function.include.php
 * http://php.net/manual/en/language.types.array.php
 */
require 'SinaUrl.php';

$long_url = $_POST["url_long"];
$result = SinaUrl::getShort($long_url);
echo $result;