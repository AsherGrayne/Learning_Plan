param(
    [Parameter(Mandatory = $true)]
    [string]$ClassName
)

$currentDir = (Resolve-Path ".").Path
$workspaceRoot = (Resolve-Path "..\..").Path
$javaFile = Join-Path $currentDir ("{0}.java" -f $ClassName)

if (-not (Test-Path $javaFile)) {
    Write-Error "Java file not found: $javaFile"
    exit 1
}

& javac $javaFile
if ($LASTEXITCODE -ne 0) {
    exit $LASTEXITCODE
}

$fqcn = "StreamAPIExamples.Slides_examples.{0}" -f $ClassName
& java -cp $workspaceRoot $fqcn
exit $LASTEXITCODE
