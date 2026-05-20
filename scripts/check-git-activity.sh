#!/usr/bin/env bash
set -euo pipefail

echo "== MKPL Git Activity Check =="

echo "[1/5] Running Maven tests..."
mvn -q clean test
echo "TEST OK: Maven test and Java assertion passed."

echo "[2/5] Checking current branch..."
branch="$(git branch --show-current)"
if [ -z "$branch" ]; then
  echo "BRANCH FAILED: not on a branch."
  exit 1
fi
echo "BRANCH OK: $branch"

echo "[3/5] Checking last commit..."
last_commit="$(git rev-parse --short HEAD)"
last_message="$(git log -1 --pretty=%s)"
echo "COMMIT OK: $last_commit $last_message"

echo "[4/5] Checking working tree..."
if [ -n "$(git status --porcelain)" ]; then
  echo "WORKTREE FAILED: uncommitted changes exist."
  git status --short
  exit 1
fi
echo "WORKTREE OK: clean."

echo "[5/5] Checking push status..."
upstream="$(git rev-parse --abbrev-ref --symbolic-full-name @{u})"
local_sha="$(git rev-parse HEAD)"
remote_sha="$(git rev-parse @{u})"
if [ "$local_sha" != "$remote_sha" ]; then
  echo "PUSH FAILED: local branch is different from upstream $upstream."
  exit 1
fi
echo "PUSH OK: local branch matches upstream $upstream."
echo "ALL CHECKS PASSED."
