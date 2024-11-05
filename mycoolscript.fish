#!/opt/homebrew/bin/fish

function init
  set -l id $argv[1]
  cd hw$id
  git init
  git add .
  git commit -m "feat: initial commit"
  gh repo create hw-wk08-$id --public --source=. --push
  cd -
end

for i in 1 2 3
  init $i
end
